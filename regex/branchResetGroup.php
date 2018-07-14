<!-- NOTE - Branch reset group is supported by Perl, PHP, Delphi and R. -->

<!-- A branch reset group consists of alternations and capturing groups. (?|(regex1)|(regex2))
Alternatives in branch reset group share same capturing group. -->

<!-- Task
You have a test string S.
Your task is to write a regex which will match S, with following condition(s):

S consists of 8 digits.
S must have "---", "-", "." or ":" separator such that string S gets divided in 4 parts,
with each part having exactly two digits.
S string must have exactly one kind of separator.
Separators must have integers on both sides.  -->

<!-- Example:
(?|(Haa)|(Hee)|(bye)|(k))\1  will match HeeHee or HaaHaa or kk -->

<?php
$Regex_Pattern = '/^[0-9]{2}(?|(\.)|(\---)|(\:)|(\-))[0-9]{2}\1[0-9]{2}\1[0-9]{2}$/'; //Do not delete '/'. Replace __________ with your regex.
$handle = fopen ("php://stdin","r");
$Test_String = fgets($handle);
if(preg_match($Regex_Pattern, $Test_String, $output_array)){
    print ("true");
} else {
    print ("false");
}
fclose($handle);
?>

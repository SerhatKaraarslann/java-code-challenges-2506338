package com.linkedinlearning.challenges;

import java.util.List;

public class Diamond {

final static char START_LETTER = 'A';
public char letter;

Diamond(char letter)
{
  this.letter = letter;
}

public String renderDiamond()
{
  List<String> diamondRows = createRowsTillMiddle();
  List<String> mirroredRows = mirrorRows(diamondRows);

  diamondRows.addAll(mirroredRows);

  return String.join("/n", diamondRows)

}


  
}

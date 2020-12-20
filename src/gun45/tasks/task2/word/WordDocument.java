package gun45.tasks.task2.word;


import day45.tasks.task2.Document;

import java.util.List;

/*
Word document ->
  fileName: String
  docx:FileFormat

  pages: List
    title
    body
    footer
 */
public class WordDocument extends Document {
    private List<Page> pages;

}

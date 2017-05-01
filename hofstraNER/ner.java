import edu.stanford.nlp.ie.crf.*;
import edu.stanford.nlp.ie.AbstractSequenceClassifier;

import java.io.IOException;

public class ner {

    public static void main(String[] file) throws IOException {


        AbstractSequenceClassifier classifier = CRFClassifier.getClassifierNoExceptions("classifiers/ner-eng-ie.crf-3-all2008.ser.gz");

      /*
      To Do - Placeholder for file loader logic to read contents of strings.txt from resources and apply classifier
       */

        String first = "Hello, my name is Bhanu Mittal. I live in Long Island.";
        String second = "I go to school at Hofstra University, which is located in New York.";
        System.out.println(classifier.classifyToString(first));
        System.out.println(classifier.classifyWithInlineXML(second));
    }

}

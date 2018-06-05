package questions;

import java.util.*;

public class WordCounter{



    public void countWords(){

        ArrayList<Word> listOfWords = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer("java is the best programming language java is flexible and the most used language java is the most language java is the the is is the");
        List<String> wordsToExclude = Arrays.asList("is", "the", "and");

        while (tokenizer.hasMoreTokens()){
            String word = tokenizer.nextToken();
            //case word is not a word to exclude calculate the number of ocurrencies
            if(wordsToExclude.stream().filter(p -> p.equals(word)).count() != 1){
                //find the fist entry of the element in the result list
                Optional<Word> wordInList = listOfWords.stream()
                        .filter(p -> p.word.equals(word))
                        .findFirst();
                Word wordObj = null;
                if(wordInList.isPresent())
                    wordObj = wordInList.get();
                //if present increment the number of ocurrency
                if(wordObj != null){
                    wordObj.numberOfOcurrency += 1;
                }else {
                    //if not present, instanciate a new Word
                    listOfWords.add(new Word(word, 1));
                }

            }

        }
        Collections.sort(listOfWords);
        listOfWords.stream().filter(p -> p.numberOfOcurrency > 1)
                .forEach(p -> System.out.print(p.word +  " "));
    }

    public static void main(String[] arg){
        WordCounter wc = new WordCounter();
        wc.countWords();
    }

    class Word  implements Comparable<Object>{
        String word;
        Integer numberOfOcurrency;

        public Word(String word, Integer numberOfOcurrency){
            this.word = word;
            this.numberOfOcurrency = numberOfOcurrency;
        }

        @Override
        public int compareTo(Object o) {
            if(( (Word)o).numberOfOcurrency.compareTo(this.numberOfOcurrency) > 0)
                return 1;
            return -1;
        }
    }
}

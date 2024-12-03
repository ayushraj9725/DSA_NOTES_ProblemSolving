public class CheckPrefixSentence {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int i = 0;
        for (String s : sentence.split(" +")) {
            if (s.startsWith(searchWord)) {
                return i + 1; // when at first what evere char or group of charter starting eiht given word
                              // just return thats index , that we found using String type arrat in java we
                              // are spliting string into string type array and get index .
            }
            i++;
        }

        return -1; // at last if not found any things just return -1
    }
}

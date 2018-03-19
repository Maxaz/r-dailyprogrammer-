import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String firstLine = scan.nextLine();
        String firstLine = "150 150 300 150 150";
        ArrayList<Integer> shelves = firstLiner(firstLine);
        ArrayList<MyBook> bookCollection = new ArrayList<>();
        bookCollection.add(collectBooks("70 A Game of Thrones"));
        bookCollection.add(collectBooks("76 A Clash of Kings"));
        bookCollection.add(collectBooks("99 A Storm of Swords"));
        bookCollection.add(collectBooks("75 A Feasts for Crows"));
        bookCollection.add(collectBooks("105 A Dance With Dragons"));

//        while (scan.hasNextLine()) {
//            System.out.println(scan.hasNextLine());
//            System.out.println("next line : " + scan.nextLine());
//            bookCollection.add(collectBooks(scan.nextLine()));
//
//        }

        solveCountShelves(shelves, bookCollection);
        System.out.println("\n*********************************************************");

        firstLine = "500 500 500";
        shelves = firstLiner(firstLine);
        bookCollection = new ArrayList<>();
        bookCollection.add(collectBooks("1309 Artamene"));
        bookCollection.add(collectBooks("303 A la recherche du temps perdu"));
        bookCollection.add(collectBooks("399 Mission Earth"));
        solveCountShelves(shelves, bookCollection);

        System.out.println("\n*********************************************************");
        firstLine = "270 142 501 865 384 957 947 603 987 428 907 10 691 707 397 917 492 750 935 672 935 712 234 683 702 508 822 379 36 59 382 280 867 155 829 756 360 995 526 52 559 250 450 843 523 446 972 555 55 985 81 831 43 802 473 379 461 639 910 529 128 878 914 426 569 59 139 913 69 649 501 889 470 112 92 6 80 571 220 22 676 91 889 799 115 194 555 477 277 718 378 838 822 358 178 562 674";
        shelves = firstLiner(firstLine);
        bookCollection = new ArrayList<>();
        bookCollection.add(collectBooks("96 b400786"));
        bookCollection.add(collectBooks("69 b390773"));
        bookCollection.add(collectBooks("174 b410413"));
        bookCollection.add(collectBooks("189 b337528"));
        bookCollection.add(collectBooks("80 b308576"));
        bookCollection.add(collectBooks("194 b151872"));
        bookCollection.add(collectBooks("190 b174310"));
        bookCollection.add(collectBooks("157 b272731"));
        bookCollection.add(collectBooks("45 b326576"));
        bookCollection.add(collectBooks("112 b379689"));
        bookCollection.add(collectBooks("177 b18459"));
        bookCollection.add(collectBooks("122 b915759"));
        bookCollection.add(collectBooks("138 b967342"));
        bookCollection.add(collectBooks("96 b786519"));
        bookCollection.add(collectBooks("184 b718074"));
        bookCollection.add(collectBooks("75 b696975"));
        bookCollection.add(collectBooks("192 b46366"));
        bookCollection.add(collectBooks("168 b533904"));
        bookCollection.add(collectBooks("45 b885475"));
        bookCollection.add(collectBooks("186 b872991"));
        bookCollection.add(collectBooks("63 b231207"));
        bookCollection.add(collectBooks("162 b912709"));
        bookCollection.add(collectBooks("123 b786720"));
        bookCollection.add(collectBooks("7 b743805"));
        bookCollection.add(collectBooks("120 b862301"));
        bookCollection.add(collectBooks("54 b929784"));
        bookCollection.add(collectBooks("89 b61876"));
        bookCollection.add(collectBooks("168 b775890"));
        bookCollection.add(collectBooks("87 b850242"));
        bookCollection.add(collectBooks("60 b695331"));
        bookCollection.add(collectBooks("0 b56157"));
        bookCollection.add(collectBooks("139 b875241"));
        bookCollection.add(collectBooks("78 b281324"));
        bookCollection.add(collectBooks("122 b236962"));
        bookCollection.add(collectBooks("1 b79403"));
        bookCollection.add(collectBooks("68 b213353"));
        bookCollection.add(collectBooks("103 b650997"));
        bookCollection.add(collectBooks("97 b955752"));
        bookCollection.add(collectBooks("177 b815100"));
        bookCollection.add(collectBooks("139 b958679"));
        bookCollection.add(collectBooks("43 b829736"));
        bookCollection.add(collectBooks("163 b445471"));
        bookCollection.add(collectBooks("94 b472821"));
        bookCollection.add(collectBooks("167 b5429"));
        bookCollection.add(collectBooks("57 b946679"));
        bookCollection.add(collectBooks("13 b748794"));
        bookCollection.add(collectBooks("146 b920913"));
        bookCollection.add(collectBooks("17 b547056"));
        bookCollection.add(collectBooks("33 b437091"));
        bookCollection.add(collectBooks("12 b247401"));
        bookCollection.add(collectBooks("120 b228908"));
        bookCollection.add(collectBooks("178 b509018"));
        bookCollection.add(collectBooks("98 b482352"));
        bookCollection.add(collectBooks("152 b915322"));
        bookCollection.add(collectBooks("14 b874214"));
        bookCollection.add(collectBooks("71 b164605"));
        bookCollection.add(collectBooks("11 b457140"));
        bookCollection.add(collectBooks("35 b502201"));
        bookCollection.add(collectBooks("5 b15232"));
        bookCollection.add(collectBooks("49 b641136"));
        bookCollection.add(collectBooks("166 b385360"));
        bookCollection.add(collectBooks("183 b78285"));
        bookCollection.add(collectBooks("199 b274935"));
        bookCollection.add(collectBooks("195 b424221"));
        bookCollection.add(collectBooks("79 b422570"));
        bookCollection.add(collectBooks("150 b502699"));
        bookCollection.add(collectBooks("41 b662132"));
        bookCollection.add(collectBooks("63 b430898"));
        bookCollection.add(collectBooks("111 b813368"));
        bookCollection.add(collectBooks("100 b700970"));
        bookCollection.add(collectBooks("157 b803925"));
        bookCollection.add(collectBooks("140 b611243"));
        bookCollection.add(collectBooks("25 b877197"));
        bookCollection.add(collectBooks("136 b577201"));
        bookCollection.add(collectBooks("94 b50211"));
        bookCollection.add(collectBooks("56 b762270"));
        bookCollection.add(collectBooks("120 b578094"));
        bookCollection.add(collectBooks("21 b672002"));
        bookCollection.add(collectBooks("9 b107630"));
        bookCollection.add(collectBooks("156 b547721"));
        bookCollection.add(collectBooks("186 b911854"));
        bookCollection.add(collectBooks("71 b594375"));
        bookCollection.add(collectBooks("32 b330202"));
        bookCollection.add(collectBooks("3 b464002"));
        bookCollection.add(collectBooks("36 b718293"));
        bookCollection.add(collectBooks("44 b282975"));
        bookCollection.add(collectBooks("130 b826246"));
        bookCollection.add(collectBooks("77 b529800"));
        bookCollection.add(collectBooks("117 b66381"));
        bookCollection.add(collectBooks("89 b949447"));
        bookCollection.add(collectBooks("133 b348326"));
        bookCollection.add(collectBooks("178 b517646"));
        bookCollection.add(collectBooks("184 b809038"));
        bookCollection.add(collectBooks("105 b70260"));
        bookCollection.add(collectBooks("182 b894577"));
        bookCollection.add(collectBooks("123 b203409"));
        bookCollection.add(collectBooks("79 b174217"));
        bookCollection.add(collectBooks("159 b552286"));
        bookCollection.add(collectBooks("40 b854638"));
        bookCollection.add(collectBooks("78 b159990"));
        bookCollection.add(collectBooks("139 b743008"));
        bookCollection.add(collectBooks("1 b714402"));
        bookCollection.add(collectBooks("153 b923819"));
        bookCollection.add(collectBooks("107 b201001"));
        bookCollection.add(collectBooks("48 b567066"));
        bookCollection.add(collectBooks("138 b570537"));
        bookCollection.add(collectBooks("100 b64396"));
        bookCollection.add(collectBooks("139 b412215"));
        bookCollection.add(collectBooks("132 b805036"));
        bookCollection.add(collectBooks("121 b772401"));
        bookCollection.add(collectBooks("120 b370907"));
        bookCollection.add(collectBooks("51 b388905"));
        bookCollection.add(collectBooks("77 b442295"));
        bookCollection.add(collectBooks("152 b195720"));
        bookCollection.add(collectBooks("46 b453542"));
        solveCountShelves(shelves, bookCollection);

        System.out.println("*********************************************************");

    }

    private static ArrayList<Integer> firstLiner(String firstLine) {
        String[] firstLineArray = firstLine.split(" ");

        ArrayList<Integer> shelves = new ArrayList<>();
        for (String aFirstLineArray : firstLineArray) {
            shelves.add(Integer.parseInt(aFirstLineArray));
        }
        return shelves;
    }

    private static MyBook collectBooks(String book) {

        String[] bookDetails = book.split(" ");
        return new MyBook(bookDetails);

    }


    private static void solveCountShelves(ArrayList<Integer> shelves, ArrayList<MyBook> bookCollection) {
        Collections.sort(shelves);
        Collections.sort(bookCollection, Collections.reverseOrder());
        ArrayList<String> booksShelved;
        HashMap<Integer, ArrayList<String>> shelvesBought = new HashMap<>();
        int maxBook = Collections.max(bookCollection).getBookSize();
        int maxShelf = Collections.max(shelves);
        int free;

        if (maxBook < maxShelf) {
            for (int i = shelves.size() - 1; i >= 0; i--) {
                free = shelves.get(i);
                booksShelved = new ArrayList<>();


                for (MyBook myBook : bookCollection) {
                    if ((free >= myBook.getBookSize()) && (!myBook.isToDelete())) {
                        booksShelved.add(myBook.getBookName());
                        free -= myBook.getBookSize();
                        myBook.setToDelete(true);
                    }
                }

                if (!booksShelved.isEmpty()) {
                    shelvesBought.put(shelves.get(i), booksShelved);
                }
            }
        }
        displayList(shelvesBought, bookCollection);
    }

    private static void displayList(HashMap<Integer, ArrayList<String>> hashMap, ArrayList<MyBook> bookCollection) {
        if (hashMap.isEmpty()) {
            System.out.println("Impossible");
        } else {
            Set<Integer> setOfKeySet = hashMap.keySet();
            for (int key : setOfKeySet) {
                System.out.println("\n(" + key + "): ");

                for (String book : hashMap.get(key)) {
                    System.out.println(book + " ");
                }
            }

            System.out.println("\nBought " + hashMap.size() + " shelves");
        }
        System.out.println("Unshelved books: ");
        int unshBooks = 0;
        for (MyBook aBookCollection : bookCollection) {
            if (!aBookCollection.isToDelete()) {
                System.out.print(aBookCollection.getBookName() + ", ");
                unshBooks++;
            }
        }
        if (unshBooks == 0) {
            System.out.println("none");
        }
    }

}

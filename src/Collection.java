class Collection {
    private static Integer[] array;

    Collection(Integer[] array) {
        Collection.array = array;
    }

    public ForwardIterator useForwardIterator() {
        return new ForwardIterator();
    }

    public class ForwardIterator implements Iterator {

        int i = 0;

        @Override
        public boolean hasNext() {
            return i < array.length;
        }

        @Override
        public Integer next() {
            return array[i++];
        }
    }


    public BackwardIterator useBackwardIterator() {
        return new BackwardIterator();
    }

    public class BackwardIterator implements Iterator {

        int i = array.length - 1;

        @Override
        public boolean hasNext() {
            return i >= 0;
        }

        @Override
        public Integer next() {
            i = i - 2;
            return array[i + 2];
        }
    }


    public Iterator useLocalIterator() {
        class LocalIterator implements Iterator {

            int i = 0;

            @Override
            public boolean hasNext() {
                return i < array.length;
            }

            @Override
            public Integer next() {
                return array[i++];
            }
        }

        return new LocalIterator();
    }




    public Iterator useAnonymIterator() {
        return new Iterator() {
            int i = array.length - 1;

            @Override
            public boolean hasNext() {
                return i >= 0;
            }

            @Override
            public Integer next() {
                return array[i--];
            }
        };
    }



    static class StaticIterator implements Iterator {
        int i = 0;

        @Override
        public boolean hasNext() {
            return i < array.length;
        }

        @Override
        public Integer next() {
            return array[i++];
        }
    }

    static StaticIterator useStaticIterator() {
        return new StaticIterator();
    }
}


interface Iterator {

    boolean hasNext();

    Integer next();
}













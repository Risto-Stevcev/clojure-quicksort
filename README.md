# Clojure QuickSort

A quicksort implementation in Clojure w/o a random pivot. Surprisingly, the implementation is 4-5 times slower than the
Scheme version, even though it's running on the JVM:

    time clojure -j -Xss6m quicksort.clj
    real    0m3.407s
    user    0m4.753s
    sys	    0m0.420s

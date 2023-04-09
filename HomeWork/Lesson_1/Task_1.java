public static int[] divideArrays(int[] arr1, int[] arr2) {
    if (arr1.length != arr2.length) {
        throw new RuntimeException("длины массивов не равны!");
    }
    
    int[] result = new int[arr1.length];
    for (int i = 0; i < arr1.length; i++) {
        if (arr2[i] == 0) {
            throw new RuntimeException("Деление на ноль не допускается!");
        }
        result[i] = arr1[i] / arr2[i];
    }
    
    return result;
}

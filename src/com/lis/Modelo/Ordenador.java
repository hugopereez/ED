package com.lis.Modelo;
import java.util.Arrays;

public class Ordenador {
    public void shell(int A[]) {

        int salto, aux, i;
        boolean cambios;

        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {
                cambios = false;
                for (i = salto; i < A.length; i++) {
                    if (A[i - salto] > A[i]) {
                        aux = A[i];
                        A[i] = A[i - salto];
                        A[i - salto] = aux;
                        cambios = true;
                    }
                }
            }
        }
    }

    public void insertionSort(DoubleLinkList lista) {
        int i, j;
        DoubleLink key;
        for (i = 1; i < lista.getSize(); i++) {
            key = lista.getIndexLink(i);
            j = i - 1;
            while (j > 0 && Integer.parseInt(lista.getIndexLink(j).getData().getId()) < Integer
                    .parseInt(key.getData().getId())) {
                lista.getIndexLink(j + 1).setData(lista.getIndexLink(j).getData());
                j = j - 1;
            }
            lista.getIndexLink(j + 1).setData(key.getData());
        }
    }

    public void radixSort(DoubleLinkList lista) {
        int arr[]=new int[lista.getSize()];
        DoubleLink temp = lista.getHead();
        for (int i = 0; i < lista.getSize(); i++) {
            arr[i]=Integer.valueOf(temp.getData().getId());
            temp = temp.getNext();
        }

        int m = getMax(arr, lista.getSize());

        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, lista.getSize(), exp);
    }

    private int getMax(int arr[], int n) {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }

    private void countSort(int arr[], int n, int exp) {
        int output[] = new int[n];
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);

        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }
}
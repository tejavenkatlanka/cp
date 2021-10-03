package com.github.general.exception;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TRY {

  public static void main(String[] args) {
    System.out.println(new TRY().finallyObject());

  }

  public Obj finallyObject() {
    Obj s = new Obj();

    try {
      List<String> list = Arrays.asList("String", "one", "apple", "one", "apple", "one");

      Optional<String> result = list.stream()
          .collect(
              Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
          .entrySet().stream().sorted((e1, e2) ->
              {
                if (e2.getValue().equals(e1.getValue())) {
                  return e1.getKey().compareTo(e2.getKey());
                }
                return e2.getValue().compareTo(e1.getValue());
              }

          ).findFirst().map(
              Entry::getKey);
// throw new RuntimeException("canprocess");
      result.ifPresent(System.out::println);
      s.i = 1;
      return s;

    } catch (Exception e) {
      System.out.println("Ex");
      s.i = 2;

      return s;

    } finally {
      s.i = 3;
      // return s;
    }


  }

  public int finallyMet() {
    int s = 0;

    try {
      // throw new RuntimeException("canprocess");
      s = 1;
      return s;

    } catch (Exception e) {
      System.out.println("Ex");
      s = 2;

      return 2;

    } finally {
      s = 3;
//      return s;
    }


  }

  public static class Obj {

    int i;

    @Override
    public String toString() {
      return "Obj{" +
          "i=" + i +
          '}';
    }
  }


  public int finallyTest() {
    try {
      throw new RuntimeException("canprocess");
      //return 1;

    } catch (Exception e) {
      System.out.println("Ex");
      return 2;

    } finally {
      return 3;
    }


  }

  public int finallyTestRes() {
    try (Clsoe s = new Clsoe()) {
      //throw  new RuntimeException("canprocess");
      //return 1;

    } catch (Exception e) {
      System.out.println("Ex");
      // e.printStackTrace();
      return 2;

    } finally {
      return 3;
    }


  }

  public static class Clsoe implements Closeable {

    public Clsoe() {
      throw new RuntimeException("close");

    }

    @Override
    public void close() throws IOException {
      throw new RuntimeException("close");
    }
  }

}

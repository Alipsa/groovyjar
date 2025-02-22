package se.alipsa.groovy

class Greeting {

  static void main(String[] args) {
    if (args.length > 0) {
      println "Hello, the $args.length args are ${String.join(',', args)}"
    } else {
      println "Hello"
    }
  }
}
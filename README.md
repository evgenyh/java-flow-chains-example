# Java 9 Flow with Processor Example - HoneyFlower Systems

![The Reactive Magazine Publisher ](img/java-9-flow-publisher-processor-subscriber.png)

## Description

This is a simple project that shows how to use Java 9's Flow API to create a Reactive Programming example. It's based on a story: a Magazine Publisher with two different Subscribers, one of them being too slow to pick items. 

## Code Structure

* `ReactiveFlowApp` creates a Publisher using Java 9's `SubmissionPublisher`. It implements backpressure and dropping of items by setting a timeout for subscribers.
* `MagazineSubscriber` implements `Flow.Subscriber` and let you experiment what happens when subscribers are slow.
* `ColorConsoleAppender` has nothing to do with Java 9 or reactive programming, is just a utility class to set colors to log messages so the result can be understood easier.

## Feedback and Contribution

If you find something wrong, feel free to create an issue. Same if you have questions. If you want to help me creating more code examples you can [buy me a coffee](https://www.buymeacoffee.com/ZyLJNUR).

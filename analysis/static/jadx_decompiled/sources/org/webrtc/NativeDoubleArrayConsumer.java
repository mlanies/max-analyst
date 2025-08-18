package org.webrtc;

/* loaded from: classes2.dex */
public class NativeDoubleArrayConsumer {
    private final Consumer consumer;

    public interface Consumer {
        void consume(Double[] dArr);
    }

    public NativeDoubleArrayConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    @CalledByNative
    public void consume(Double[] dArr) {
        this.consumer.consume(dArr);
    }
}

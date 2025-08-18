package org.webrtc;

/* loaded from: classes2.dex */
public class NativeDumpCallback implements DumpCallback {
    private final DumpCallback callback;

    public NativeDumpCallback(DumpCallback dumpCallback) {
        this.callback = dumpCallback;
    }

    @Override // org.webrtc.DumpCallback
    @CalledByNative
    public void onComplete(String str) {
        this.callback.onComplete(str);
    }

    @Override // org.webrtc.DumpCallback
    @CalledByNative
    public void onStarted(String str) {
        this.callback.onStarted(str);
    }
}

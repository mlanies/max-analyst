package androidx.camera.core.impl;

/* loaded from: classes.dex */
public class CameraValidator$CameraIdListIncorrectException extends Exception {
    public final int a;

    public CameraValidator$CameraIdListIncorrectException(String str, int i, IllegalArgumentException illegalArgumentException) {
        super(str, illegalArgumentException);
        this.a = i;
    }
}

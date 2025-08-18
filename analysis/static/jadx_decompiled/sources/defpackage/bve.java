package defpackage;

import javax.net.ssl.SSLEngineResult;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class bve {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[SSLEngineResult.HandshakeStatus.values().length];
        try {
            iArr[SSLEngineResult.HandshakeStatus.NEED_UNWRAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SSLEngineResult.HandshakeStatus.NEED_WRAP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SSLEngineResult.HandshakeStatus.FINISHED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SSLEngineResult.HandshakeStatus.NEED_TASK.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[SSLEngineResult.Status.values().length];
        try {
            iArr2[SSLEngineResult.Status.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[SSLEngineResult.Status.CLOSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[SSLEngineResult.Status.BUFFER_OVERFLOW.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[SSLEngineResult.Status.BUFFER_UNDERFLOW.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}

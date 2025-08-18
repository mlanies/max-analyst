package defpackage;

import org.webrtc.PeerConnectionFactory;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class uq9 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[au1.v(3).length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[2] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[1] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[PeerConnectionFactory.EnhancerKind.values().length];
        try {
            iArr2[PeerConnectionFactory.EnhancerKind.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[PeerConnectionFactory.EnhancerKind.PIPELINE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PeerConnectionFactory.EnhancerKind.BASELINE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}

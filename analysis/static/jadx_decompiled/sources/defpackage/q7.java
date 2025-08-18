package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class q7 {
    public static final List d = y53.M("", "null", "libvpx", "unknown");
    public final m61 a;
    public final s7 b;
    public final va8 c;

    public q7(n61 n61Var, wte wteVar) {
        this.a = n61Var;
        v59 v59Var = new v59(2, this, q7.class, "onVideoCodec", "onVideoCodec(Lru/ok/android/webrtc/stat/codec/ActiveEncodersStats$NamedCodecInfo;J)V", 0, 15);
        s7 s7Var = new s7();
        s7Var.c = wteVar;
        s7Var.d = v59Var;
        this.b = s7Var;
        int i = 2;
        this.c = new va8(i, new om8(1, this, q7.class, "onAudioCodec", "onAudioCodec(Lru/ok/android/webrtc/stat/codec/ActiveEncodersStats$NamedCodecInfo;)V", 0, 23));
    }
}

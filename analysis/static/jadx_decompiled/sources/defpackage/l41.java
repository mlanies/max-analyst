package defpackage;

import one.me.calls.ui.ui.call.CallScreen;

/* loaded from: classes.dex */
public final class l41 implements k64 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean o;

    public l41(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.o = z3;
        this.X = z4;
    }

    @Override // defpackage.k64
    public final Object a() {
        CallScreen.R0.getClass();
        return new CallScreen(dy7.g(new kpa("type", "LINK"), new kpa("link", this.a), new kpa("video_enabled", Boolean.valueOf(this.b)), new kpa("microphone_enabled", Boolean.valueOf(this.c)), new kpa("front_camera_enabled", Boolean.valueOf(this.o)), new kpa("is_new", Boolean.valueOf(this.X))));
    }
}

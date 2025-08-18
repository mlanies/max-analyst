package defpackage;

import one.me.calls.ui.ui.incoming.CallIncomingScreen;

/* loaded from: classes.dex */
public final class o41 implements k64 {
    public final /* synthetic */ long a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean o;

    public o41(long j, String str, String str2, boolean z) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.o = z;
    }

    @Override // defpackage.k64
    public final Object a() {
        CallIncomingScreen.Z.getClass();
        return new CallIncomingScreen(dy7.g(new kpa("call_incoming_avatar", this.c), new kpa("call_incoming_name", this.b), new kpa("call_incoming_chat_id", Long.valueOf(this.a)), new kpa("call_incoming_video", Boolean.valueOf(this.o))));
    }
}

package defpackage;

import one.me.calls.ui.ui.call.CallScreen;

/* loaded from: classes.dex */
public final class m41 implements k64 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean o;

    public /* synthetic */ m41(long j, boolean z, boolean z2, int i) {
        this.a = i;
        this.b = j;
        this.c = z;
        this.o = z2;
    }

    @Override // defpackage.k64
    public final Object a() {
        switch (this.a) {
            case 0:
                CallScreen.R0.getClass();
                return new CallScreen(dy7.g(new kpa("type", "ONE_TO_ONE"), new kpa("opponent_id", Long.valueOf(this.b)), new kpa("video_enabled", Boolean.valueOf(this.c)), new kpa("microphone_enabled", Boolean.valueOf(this.o))));
            default:
                CallScreen.R0.getClass();
                return new CallScreen(dy7.g(new kpa("type", "CHAT"), new kpa("chat_id", Long.valueOf(this.b)), new kpa("video_enabled", Boolean.valueOf(this.c)), new kpa("microphone_enabled", Boolean.valueOf(this.o))));
        }
    }
}

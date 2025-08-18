package defpackage;

import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

/* loaded from: classes.dex */
public final class z41 implements a51 {
    public final CallsAudioDeviceInfo a;
    public final int b = y7a.L;
    public final int c = x7a.P;
    public final int d = x7a.O;
    public final eqe e;
    public final eqe f;

    public z41(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        this.a = callsAudioDeviceInfo;
        eqe eqeVar = new eqe(b8a.r2);
        this.e = eqeVar;
        this.f = eqeVar;
    }

    @Override // defpackage.a51
    public final int a() {
        return this.c;
    }

    @Override // defpackage.a51
    public final CallsAudioDeviceInfo b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z41) && tpa.f(this.a, ((z41) obj).a);
    }

    @Override // defpackage.a51
    public final jqe getContentDescription() {
        return this.f;
    }

    @Override // defpackage.a51
    public final int getIcon() {
        return this.d;
    }

    @Override // defpackage.a51
    public final int getId() {
        return this.b;
    }

    @Override // defpackage.a51
    public final jqe getTitle() {
        return this.e;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WiredHeadset(device=" + this.a + ")";
    }
}

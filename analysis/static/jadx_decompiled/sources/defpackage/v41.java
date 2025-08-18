package defpackage;

import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

/* loaded from: classes.dex */
public final class v41 implements a51 {
    public final CallsAudioDeviceInfo a;
    public final boolean b;
    public final int c = y7a.H;
    public final int d;
    public final int e;
    public final gqe f;
    public final gqe g;

    public v41(CallsAudioDeviceInfo callsAudioDeviceInfo, boolean z) {
        this.a = callsAudioDeviceInfo;
        this.b = z;
        this.d = z ? x7a.w : x7a.v;
        this.e = x7a.F0;
        gqe gqeVar = new gqe(b8a.n2, ys.m0(new Object[]{callsAudioDeviceInfo.getName()}));
        this.f = gqeVar;
        this.g = gqeVar;
    }

    @Override // defpackage.a51
    public final int a() {
        return this.d;
    }

    @Override // defpackage.a51
    public final CallsAudioDeviceInfo b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v41)) {
            return false;
        }
        v41 v41Var = (v41) obj;
        return tpa.f(this.a, v41Var.a) && this.b == v41Var.b;
    }

    @Override // defpackage.a51
    public final jqe getContentDescription() {
        return this.g;
    }

    @Override // defpackage.a51
    public final int getIcon() {
        return this.e;
    }

    @Override // defpackage.a51
    public final int getId() {
        return this.c;
    }

    @Override // defpackage.a51
    public final jqe getTitle() {
        return this.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Bluetooth(device=" + this.a + ", isGroupCallEnabled=" + this.b + ")";
    }
}

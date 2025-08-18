package defpackage;

import android.media.VolumeProvider;

/* loaded from: classes.dex */
public final class rqf extends VolumeProvider {
    public final /* synthetic */ v4b a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqf(v4b v4bVar, int i, int i2, int i3, String str) {
        super(i, i2, i3, str);
        this.a = v4bVar;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i) {
        v4b v4bVar = this.a;
        v4bVar.getClass();
        oaf.W(v4bVar.f, new u4b(v4bVar, i, 1, 1));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i) {
        v4b v4bVar = this.a;
        v4bVar.getClass();
        oaf.W(v4bVar.f, new u4b(v4bVar, i, 1, 0));
    }
}

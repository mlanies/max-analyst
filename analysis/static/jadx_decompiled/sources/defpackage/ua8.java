package defpackage;

import one.me.sdk.media.transformer.impl.MediaInfoRetriever$InvalidMediaTrackException;

/* loaded from: classes2.dex */
public final class ua8 implements yze {
    public qy5 a;
    public final khe b = new khe(new j78(1));

    @Override // defpackage.yze
    public final void a(long j, int i, int i2, int i3, wze wzeVar) {
    }

    @Override // defpackage.yze
    public final void b(wpa wpaVar, int i, int i2) {
        while (i > 0) {
            khe kheVar = this.b;
            int iMin = Math.min(i, ((byte[]) kheVar.getValue()).length);
            wpaVar.e(0, (byte[]) kheVar.getValue(), iMin);
            i -= iMin;
        }
    }

    @Override // defpackage.yze
    public final int c(m24 m24Var, int i, boolean z) {
        int i2 = i;
        while (i2 > 0) {
            khe kheVar = this.b;
            int i3 = m24Var.read((byte[]) kheVar.getValue(), 0, Math.min(i2, ((byte[]) kheVar.getValue()).length));
            if (i3 == -1) {
                throw new MediaInfoRetriever$InvalidMediaTrackException("Unexpected end of track");
            }
            i2 -= i3;
        }
        return i;
    }

    @Override // defpackage.yze
    public final void e(qy5 qy5Var) {
        this.a = qy5Var;
    }
}

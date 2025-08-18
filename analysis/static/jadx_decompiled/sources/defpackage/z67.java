package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class z67 extends e77 {
    public final a66 Y;
    public final m56 Z;

    public z67(bk bkVar, m6e m6eVar) {
        super(3, 0);
        this.Y = bkVar;
        this.Z = m6eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.e77
    public final void a(RecyclerView recyclerView, dec decVar) {
        super.a(recyclerView, decVar);
        if (decVar instanceof zp4) {
            ((s3e) ((zp4) decVar)).a.animate().translationZ(0.0f);
            this.Z.invoke(decVar);
        }
    }

    @Override // defpackage.e77
    public final boolean i(dec decVar, dec decVar2) {
        this.Y.invoke(Integer.valueOf(decVar.g()), Integer.valueOf(decVar2.g()));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.e77
    public final void j(dec decVar, int i) {
        if (i == 0 || !(decVar instanceof zp4)) {
            return;
        }
        ((s3e) ((zp4) decVar)).a.animate().translationZ(fk4.d().getDisplayMetrics().density * 20.0f);
    }
}

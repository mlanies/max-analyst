package defpackage;

import androidx.media3.common.PlaybackException;
import androidx.media3.transformer.ExportException;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes.dex */
public final class z65 implements n3b {
    public final wt a;
    public final /* synthetic */ go9 b;

    public z65(go9 go9Var, wt wtVar) {
        this.b = go9Var;
        this.a = wtVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    @Override // defpackage.n3b
    public final void X(p0f p0fVar) {
        wt wtVar = this.a;
        try {
            ?? B = p0fVar.b(1);
            int i = B;
            if (p0fVar.b(2)) {
                i = B + 1;
            }
            if (i <= 0) {
                wtVar.d(ExportException.a(new IllegalStateException("The asset loader has no track to output."), MultiFileUploader.MSG_TRY_UPLOAD_NEXT));
            } else {
                wtVar.b(i);
                ((u75) this.b.c).play();
            }
        } catch (RuntimeException e) {
            wtVar.d(ExportException.a(e, 1000));
        }
    }

    @Override // defpackage.n3b
    public final void f0(mue mueVar, int i) {
        wt wtVar = this.a;
        go9 go9Var = this.b;
        try {
            if (go9Var.b != 1) {
                return;
            }
            kue kueVar = new kue();
            mueVar.o(0, kueVar);
            if (kueVar.k) {
                return;
            }
            long j = kueVar.m;
            go9Var.b = (j <= 0 || j == -9223372036854775807L) ? 3 : 2;
            wtVar.f(j);
        } catch (RuntimeException e) {
            wtVar.d(ExportException.a(e, 1000));
        }
    }

    @Override // defpackage.n3b
    public final void x0(PlaybackException playbackException) {
        Object obj = ExportException.b.get(playbackException.b());
        this.a.d(ExportException.a(playbackException, ((Integer) (obj != null ? obj : 1000)).intValue()));
    }
}

package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class hre extends pu9 {
    public TextureView e;
    public SurfaceTexture f;
    public oq1 g;
    public see h;
    public boolean i;
    public SurfaceTexture j;
    public AtomicReference k;
    public u00 l;

    @Override // defpackage.pu9
    public final View f() {
        return this.e;
    }

    @Override // defpackage.pu9
    public final Bitmap g() {
        TextureView textureView = this.e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.e.getBitmap();
    }

    @Override // defpackage.pu9
    public final void j() {
        if (!this.i || this.j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.j;
        if (surfaceTexture != surfaceTexture2) {
            this.e.setSurfaceTexture(surfaceTexture2);
            this.j = null;
            this.i = false;
        }
    }

    @Override // defpackage.pu9
    public final void k() {
        this.i = true;
    }

    @Override // defpackage.pu9
    public final void l(see seeVar, u00 u00Var) {
        this.b = seeVar.b;
        this.l = u00Var;
        FrameLayout frameLayout = (FrameLayout) this.c;
        frameLayout.getClass();
        ((Size) this.b).getClass();
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(((Size) this.b).getWidth(), ((Size) this.b).getHeight()));
        this.e.setSurfaceTextureListener(new gre(this));
        frameLayout.removeAllViews();
        frameLayout.addView(this.e);
        see seeVar2 = this.h;
        if (seeVar2 != null) {
            seeVar2.d();
        }
        this.h = seeVar;
        Executor executorA = ot3.a(this.e.getContext());
        seeVar.k.a(new fre(this, 0, seeVar), executorA);
        p();
    }

    @Override // defpackage.pu9
    public final bm7 o() {
        return f8.g(new bqc(29, this));
    }

    public final void p() {
        SurfaceTexture surfaceTexture;
        Size size = (Size) this.b;
        if (size == null || (surfaceTexture = this.f) == null || this.h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), ((Size) this.b).getHeight());
        Surface surface = new Surface(this.f);
        see seeVar = this.h;
        oq1 oq1VarG = f8.g(new ypc(this, 11, surface));
        this.g = oq1VarG;
        oq1VarG.b.d(new yg3(this, surface, oq1VarG, seeVar, 16), ot3.a(this.e.getContext()));
        this.a = true;
        m();
    }
}

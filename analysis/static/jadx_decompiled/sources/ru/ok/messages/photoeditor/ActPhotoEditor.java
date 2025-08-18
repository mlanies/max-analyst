package ru.ok.messages.photoeditor;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import defpackage.a14;
import defpackage.bk4;
import defpackage.cl8;
import defpackage.cqc;
import defpackage.cwa;
import defpackage.ed3;
import defpackage.ewa;
import defpackage.gaa;
import defpackage.gpc;
import defpackage.hle;
import defpackage.iq1;
import defpackage.j47;
import defpackage.jc6;
import defpackage.jp;
import defpackage.jpc;
import defpackage.khe;
import defpackage.ng4;
import defpackage.nv4;
import defpackage.ov4;
import defpackage.pkg;
import defpackage.q5;
import defpackage.qg3;
import defpackage.qic;
import defpackage.qv4;
import defpackage.sme;
import defpackage.te0;
import defpackage.tme;
import defpackage.uv4;
import defpackage.v5;
import defpackage.vic;
import defpackage.x5;
import defpackage.xxb;
import defpackage.y8a;
import defpackage.yva;
import defpackage.yyb;
import defpackage.z7d;
import defpackage.zva;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import ru.ok.messages.views.dialogs.ConfirmationDialog;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.tamtam.photoeditor.view.EditorSurfaceViewContainer;

/* loaded from: classes2.dex */
public class ActPhotoEditor extends q5 implements yva, qg3 {
    public static final /* synthetic */ int Z0 = 0;
    public zva U0;
    public cl8 V0;
    public boolean W0;
    public gaa X0;
    public final khe Y0 = new khe(new x5(1, this));

    @Override // defpackage.qg3
    public final void R(Bundle bundle) {
        if (bundle != null && bundle.getBoolean("photo_editor:cancel_dialog")) {
            setResult(0);
            finish();
            return;
        }
        zva zvaVar = this.U0;
        qv4 qv4Var = zvaVar.b;
        uv4 uv4Var = qv4Var.a;
        List<nv4> layers = uv4Var.getLayers();
        for (int size = layers.size() - 1; size >= 0; size--) {
            nv4 nv4Var = layers.get(size);
            if (!(nv4Var instanceof te0)) {
                uv4Var.a.remove(nv4Var);
                uv4Var.invalidate();
            }
        }
        qv4Var.b();
        cwa cwaVar = zvaVar.e;
        cwaVar.getClass();
        cwa cwaVar2 = new cwa(false, false, false, cwaVar.o, cwaVar.X, true, cwaVar.Z);
        zvaVar.e = cwaVar2;
        zvaVar.a.a(cwaVar2);
    }

    @Override // defpackage.q5
    public final String Z() {
        return "EDIT_IMAGE";
    }

    public final void j0() {
        if (!this.U0.b.h) {
            setResult(0);
            finish();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("photo_editor:cancel_dialog", true);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("ru.ok.tamtam.extra.CONTENT_RES_ID", jpc.m2);
        bundle2.putInt("ru.ok.tamtam.extra.POSITIVE_TEXT_RES_ID", jpc.l2);
        bundle2.putInt("ru.ok.tamtam.extra.NEGATIVE_TEXT_RES_ID", jpc.r);
        bundle2.putBundle("oneme:share:data", bundle);
        ConfirmationDialog confirmationDialog = new ConfirmationDialog();
        confirmationDialog.X0(bundle2);
        confirmationDialog.k1(S(), "ru.ok.messages.views.dialogs.ConfirmationDialog");
    }

    public final void k0(ng4 ng4Var) {
        int iHeight;
        ov4 ov4VarA = this.U0.b.a();
        if (ov4VarA.a.isEmpty()) {
            ov4VarA = null;
        }
        boolean z = ov4VarA != null && ov4VarA.o;
        zva zvaVar = this.U0;
        boolean z2 = this.W0 && !z;
        qv4 qv4Var = zvaVar.b;
        Rect bounds = qv4Var.a.getBounds();
        int iWidth = 2000;
        if (bounds.width() > bounds.height()) {
            iHeight = (int) ((bounds.height() / bounds.width()) * 2000);
        } else {
            iWidth = (int) ((bounds.width() / bounds.height()) * 2000);
            iHeight = 2000;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iWidth, iHeight, Bitmap.Config.ARGB_8888);
        uv4 uv4Var = qv4Var.a;
        Rect resultBounds = uv4Var.getResultBounds();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        for (nv4 nv4Var : uv4Var.getLayers()) {
            if (nv4Var instanceof te0) {
                if (z2) {
                    te0 te0Var = (te0) nv4Var;
                    te0Var.getClass();
                    int width = canvas.getWidth();
                    int height = canvas.getHeight();
                    Drawable drawable = te0Var.a;
                    drawable.setBounds(0, 0, width, height);
                    drawable.draw(canvas);
                }
                canvas.scale(iWidth / resultBounds.width(), iHeight / resultBounds.height());
                canvas.translate(-resultBounds.left, -resultBounds.top);
            } else {
                nv4Var.draw(canvas);
            }
        }
        if (z) {
            z7d z7dVar = ((y8a) ((ed3) this.K0.b)).n().b;
            z7dVar.getClass();
            bitmapCreateBitmap = j47.e0((int) z7dVar.q(PmsKey.f84minstickersize, 432), (int) z7dVar.q(PmsKey.f74maxstickersize, 512), bitmapCreateBitmap);
        }
        Intent intent = new Intent();
        File fileQ = ((y8a) ((ed3) this.K0.b)).h().q(UUID.randomUUID().toString() + ".png");
        try {
            j47.h0(fileQ.getPath(), bitmapCreateBitmap, 100, Bitmap.CompressFormat.PNG);
            intent.putExtra("photo_editor:result_uri", Uri.fromFile(fileQ));
            intent.putExtra("photo_editor:editor_state", ov4VarA);
            intent.putExtra("photo_editor:delayed_attrs", ng4Var);
            setResult(-1, intent);
            finish();
        } catch (Exception unused) {
            int i = jpc.E;
            Handler handler = a14.i;
            a14.N(0, this, getString(i));
            setResult(0);
            finish();
        }
    }

    @Override // defpackage.q5, defpackage.yb3, android.app.Activity
    public final void onBackPressed() {
        if (this.U0.b.h) {
            j0();
        } else {
            super.onBackPressed();
        }
    }

    @Override // defpackage.q5, androidx.fragment.app.b, defpackage.yb3, android.app.Activity
    public final void onCreate(Bundle bundle) throws Exception {
        pkg pkgVar;
        super.onCreate(bundle);
        f0(this.V0.L);
        setContentView(yyb.act_photo_editor);
        this.W0 = getIntent().getBooleanExtra("photo_editor:is_drawing", false);
        sme smeVarC = ((tme) ((y8a) ((ed3) this.K0.b)).getAccessor().c(tme.class)).c();
        uv4 editorSurfaceView = ((EditorSurfaceViewContainer) findViewById(xxb.act_photo_editor__editor)).getEditorSurfaceView();
        if (!this.W0) {
            editorSurfaceView.setBackgroundColor(this.V0.m);
        } else if (smeVarC.c) {
            editorSurfaceView.setBackgroundColor(smeVarC.m);
        } else {
            editorSurfaceView.setBackgroundColor(-1);
        }
        ewa ewaVar = new ewa(findViewById(xxb.act_photo_editor__root), ((y8a) ((ed3) this.K0.b)).n().c);
        Uri uri = (Uri) getIntent().getParcelableExtra("photo_editor:background_uri");
        if (uri != null) {
            pkgVar = new pkg();
            pkgVar.a = uri;
            pkgVar.c = null;
            pkgVar.b = 0;
        } else {
            pkg pkgVar2 = new pkg();
            pkgVar2.b = -1;
            pkgVar2.a = null;
            pkgVar2.c = null;
            pkgVar = pkgVar2;
        }
        int i = smeVarC.c ? gpc.d : gpc.e;
        Resources resources = getResources();
        ThreadLocal threadLocal = vic.a;
        Drawable drawableA = qic.a(resources, i, null);
        if (drawableA == null) {
            throw new IllegalStateException("backgroundDrawable cannot be null");
        }
        pkg pkgVar3 = new pkg();
        pkgVar3.c = drawableA;
        pkgVar3.a = null;
        pkgVar3.b = 0;
        Resources resources2 = getResources();
        hle hleVarQ = ((y8a) ((ed3) this.K0.b)).q();
        jc6 jc6Var = new jc6();
        jc6Var.a = resources2;
        jc6Var.b = hleVarQ;
        jc6Var.c = pkgVar;
        jc6Var.o = pkgVar3;
        ov4 ov4Var = getIntent().hasExtra("photo_editor:editor_state") ? (ov4) getIntent().getParcelableExtra("photo_editor:editor_state") : null;
        boolean booleanExtra = getIntent().getBooleanExtra("photo_editor:start_from_draw_sticker", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("photo_editor:draw_sticker_enabled", false);
        qv4 qv4Var = new qv4(editorSurfaceView);
        khe kheVar = this.Y0;
        this.U0 = new zva(ewaVar, qv4Var, this, jc6Var, ov4Var, booleanExtra2, booleanExtra, ((Boolean) kheVar.getValue()).booleanValue());
        int i2 = ewa.x0[6];
        jp jpVar = ewaVar.c;
        ewaVar.c(jpVar.g.getInt("app.editor.color", i2));
        ewaVar.b.getContext();
        int i3 = jpVar.g.getInt("app.editor.width", bk4.a(8.0f));
        if (i3 > 0) {
            float f = i3;
            ewaVar.t0.setBrushWidth(f);
            Iterator it = ewaVar.a.iterator();
            while (it.hasNext()) {
                ((zva) it.next()).b.g = f;
            }
            jpVar.k((int) f, "app.editor.width");
        }
        if (bundle != null) {
            zva zvaVar = this.U0;
            zvaVar.getClass();
            if (bundle.containsKey("ru.ok.tamtam.extra.EDITOR_STATE")) {
                zvaVar.d.f(zvaVar.b, (ov4) bundle.getParcelable("ru.ok.tamtam.extra.EDITOR_STATE"), true);
            }
            if (bundle.containsKey("ru.ok.tamtam.extra.EDITOR_VIEW_STATE")) {
                cwa cwaVar = (cwa) bundle.getParcelable("ru.ok.tamtam.extra.EDITOR_VIEW_STATE");
                zvaVar.e = cwaVar;
                zvaVar.a.a(cwaVar);
            }
        }
        if (((Boolean) kheVar.getValue()).booleanValue()) {
            return;
        }
        ScheduledSendPickerDialogFragment.p1("ru.ok.messages.photoeditor.ActPhotoEditor", S(), this, new v5(1, this));
    }

    @Override // defpackage.q5, defpackage.im, androidx.fragment.app.b, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        cqc.b((iq1) this.U0.d.X);
    }

    @Override // defpackage.q5, defpackage.yb3, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        zva zvaVar = this.U0;
        bundle.putParcelable("ru.ok.tamtam.extra.EDITOR_STATE", zvaVar.b.a());
        bundle.putParcelable("ru.ok.tamtam.extra.EDITOR_VIEW_STATE", zvaVar.e);
    }

    @Override // defpackage.q5, defpackage.ase
    public final sme u() {
        if (this.V0 == null) {
            this.V0 = cl8.e0;
        }
        return this.V0;
    }
}

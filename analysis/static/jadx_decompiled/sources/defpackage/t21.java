package defpackage;

import android.content.Context;
import android.os.Trace;
import android.widget.FrameLayout;
import java.util.Arrays;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class t21 extends FrameLayout {
    public final q8b a;
    public final je7 b;

    public t21(Context context) {
        super(context, null, 0);
        q8b q8bVar = new q8b(context);
        this.a = q8bVar;
        this.b = tu0.r(3, new x5(21, this));
        addView(q8bVar, -1, -1);
        s21 cameraPreviewController = getCameraPreviewController();
        cameraPreviewController.getClass();
        k9b k9bVar = k9b.f;
        k12 k12VarP = s36.p(context);
        k12VarP.d(new c(cameraPreviewController, 14, k12VarP), ot3.a(context));
    }

    private final s21 getCameraPreviewController() {
        return (s21) this.b.getValue();
    }

    public final void a(boolean z, boolean z2) {
        int i = 0;
        if (tpa.f(null, Boolean.valueOf(z)) && tpa.f(null, Boolean.valueOf(z2))) {
            return;
        }
        if (!z) {
            k9b k9bVar = getCameraPreviewController().b;
            if (k9bVar != null) {
                k9bVar.f();
                return;
            }
            return;
        }
        s21 cameraPreviewController = getCameraPreviewController();
        k9b k9bVar2 = cameraPreviewController.b;
        if (k9bVar2 == null) {
            return;
        }
        if (k9bVar2 != null) {
            k9bVar2.f();
        }
        int i2 = !z2 ? 1 : 0;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c54.p("The specified lens facing is invalid.", i2 != -1);
        linkedHashSet.add(new tf7(i2));
        px1 px1Var = new px1(linkedHashSet);
        h8b h8bVarB = new mt6(2).b();
        h8bVarB.G(this.a.getSurfaceProvider());
        eh7 eh7Var = cameraPreviewController.a;
        l9f[] l9fVarArr = {h8bVarB};
        Trace.beginSection(c37.F("CX:bindToLifecycle"));
        try {
            ay1 ay1Var = k9bVar2.d;
            if (ay1Var != null) {
                yg2 yg2Var = ay1Var.f;
                if (yg2Var == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                i = ((l0f) yg2Var.c).b;
            }
            if (i == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
            }
            k9b.b(k9bVar2, 1);
            k9bVar2.d(eh7Var, px1Var, null, nz4.a, (l9f[]) Arrays.copyOf(l9fVarArr, 1));
        } finally {
            Trace.endSection();
        }
    }
}

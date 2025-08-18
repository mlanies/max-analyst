package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* loaded from: classes.dex */
public final class fvc extends View {
    public lw1 a;
    public Window b;
    public evc c;

    /* JADX INFO: Access modifiers changed from: private */
    public float getBrightness() {
        Window window = this.b;
        if (window == null) {
            return Float.NaN;
        }
        return window.getAttributes().screenBrightness;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f) {
        if (this.b == null || Float.isNaN(f)) {
            return;
        }
        WindowManager.LayoutParams attributes = this.b.getAttributes();
        attributes.screenBrightness = f;
        this.b.setAttributes(attributes);
    }

    private void setScreenFlashUiInfo(eu6 eu6Var) {
        lw1 lw1Var = this.a;
        if (lw1Var == null) {
            return;
        }
        cvc cvcVar = cvc.b;
        dvc dvcVar = new dvc(cvcVar, eu6Var);
        dvc dvcVarF = lw1Var.f();
        lw1Var.C.put(cvcVar, dvcVar);
        dvc dvcVarF2 = lw1Var.f();
        if (dvcVarF2 == null || dvcVarF2.equals(dvcVarF)) {
            return;
        }
        dvc dvcVarF3 = lw1Var.f();
        if (dvcVarF3 == null) {
            fu6 fu6Var = lw1Var.d;
            jw1 jw1Var = lw1.D;
            fu6Var.getClass();
            gvc gvcVar = new gvc(jw1Var);
            fu6Var.u = gvcVar;
            fu6Var.d().g(gvcVar);
            return;
        }
        fu6 fu6Var2 = lw1Var.d;
        fu6Var2.getClass();
        gvc gvcVar2 = new gvc(dvcVarF3.b);
        fu6Var2.u = gvcVar2;
        fu6Var2.d().g(gvcVar2);
        dvcVarF3.a.name();
    }

    public eu6 getScreenFlash() {
        return this.c;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(lw1 lw1Var) {
        kq0.e();
        lw1 lw1Var2 = this.a;
        if (lw1Var2 != null && lw1Var2 != lw1Var) {
            setScreenFlashUiInfo(null);
        }
        this.a = lw1Var;
        if (lw1Var == null) {
            return;
        }
        kq0.e();
        if (lw1Var.d.H() == 3 && this.b == null) {
            throw new IllegalStateException("No window set despite setting FLASH_MODE_SCREEN in CameraController");
        }
        setScreenFlashUiInfo(getScreenFlash());
    }

    public void setScreenFlashWindow(Window window) {
        kq0.e();
        if (this.b != window) {
            this.c = window == null ? null : new evc(this);
        }
        this.b = window;
        setScreenFlashUiInfo(getScreenFlash());
    }
}

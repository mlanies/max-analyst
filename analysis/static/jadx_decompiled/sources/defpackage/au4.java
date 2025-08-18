package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class au4 extends ju0 {
    public final /* synthetic */ int d;

    public /* synthetic */ au4(int i) {
        this.d = i;
    }

    @Override // defpackage.ju0
    public final void G(Object obj, float f) {
        switch (this.d) {
            case 0:
                ((View) obj).setAlpha(f);
                break;
            case 1:
                ((View) obj).setTranslationX(f);
                break;
            case 2:
                ((View) obj).setTranslationY(f);
                break;
            case 3:
                ((View) obj).setScaleX(f);
                break;
            case 4:
                ((View) obj).setScaleY(f);
                break;
            case 5:
                ((View) obj).setRotation(f);
                break;
            case 6:
                ((View) obj).setRotationX(f);
                break;
            default:
                ((View) obj).setRotationY(f);
                break;
        }
    }

    @Override // defpackage.ju0
    public final float u(Object obj) {
        switch (this.d) {
            case 0:
                return ((View) obj).getAlpha();
            case 1:
                return ((View) obj).getTranslationX();
            case 2:
                return ((View) obj).getTranslationY();
            case 3:
                return ((View) obj).getScaleX();
            case 4:
                return ((View) obj).getScaleY();
            case 5:
                return ((View) obj).getRotation();
            case 6:
                return ((View) obj).getRotationX();
            default:
                return ((View) obj).getRotationY();
        }
    }
}

package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import ru.ok.utils.widgets.BadgeCountView;

/* loaded from: classes2.dex */
public final class sc0 extends u2 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ Object o;

    /* JADX WARN: Illegal instructions before constructor call */
    public sc0(tc0 tc0Var, fka fkaVar) {
        Boolean bool = Boolean.TRUE;
        this.o = tc0Var;
        this.X = fkaVar;
        super(9, bool);
    }

    @Override // defpackage.u2
    public final void L1(Object obj, Object obj2) {
        int i;
        switch (this.c) {
            case 0:
                if (!tpa.f(obj, obj2)) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    tc0 tc0Var = (tc0) this.o;
                    Paint paintB = tc0Var.b();
                    fka fkaVar = (fka) this.X;
                    if (zBooleanValue) {
                        fkaVar.getText();
                        i = -1;
                    } else {
                        i = fkaVar.getText().e;
                    }
                    paintB.setColor(i);
                    tc0Var.c();
                    tc0Var.invalidateSelf();
                    break;
                }
                break;
            default:
                int iIntValue = ((Number) obj2).intValue();
                ((Number) obj).intValue();
                BadgeCountView badgeCountView = (BadgeCountView) this.o;
                if (badgeCountView.getManageVisibility()) {
                    badgeCountView.setVisibility(iIntValue > 0 ? 0 : 8);
                }
                ag0 ag0Var = null;
                if (badgeCountView.getVisibility() != 0) {
                    badgeCountView.setText((CharSequence) null);
                    break;
                } else if (iIntValue >= 0) {
                    badgeCountView.setText(badgeCountView.getNeedPlusIndicator() ? ((Context) this.X).getString(d2c.folder_new_messages_max_exceeded, Integer.valueOf(iIntValue)) : String.valueOf(iIntValue));
                    int i2 = badgeCountView.y0;
                    GradientDrawable gradientDrawableS = iIntValue < 10 ? hm9.S(Integer.valueOf(i2), null, null) : hm9.b0(Integer.valueOf(i2), null, null, tu0.G(20 * fk4.d().getDisplayMetrics().density));
                    if (1 <= iIntValue && iIntValue < 10) {
                        ag0Var = new ag0(gradientDrawableS, 20, 0.0f, 12);
                    } else if (10 <= iIntValue && iIntValue < 100) {
                        ag0Var = new ag0(gradientDrawableS, 22, 0.0f, 12);
                    } else if (100 <= iIntValue && iIntValue < 1000) {
                        ag0Var = new ag0(gradientDrawableS, 26, 0.0f, 12);
                    } else if (1000 <= iIntValue && iIntValue < 10000) {
                        ag0Var = new ag0(gradientDrawableS, 31, 10.0f, 4);
                    }
                    badgeCountView.setStyle(ag0Var);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc0(BadgeCountView badgeCountView, Context context) {
        super(9, (Object) 0);
        this.o = badgeCountView;
        this.X = context;
    }
}

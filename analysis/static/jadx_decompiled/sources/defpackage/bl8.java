package defpackage;

import android.content.Context;
import android.view.View;

/* loaded from: classes2.dex */
public abstract class bl8 extends ppe implements mc8 {
    public static final /* synthetic */ bc7[] B0;
    public final yj A0;

    static {
        oi9 oi9Var = new oi9(bl8.class, "model", "getModel()Lone/me/messages/list/loader/model/MediaAttachInfo;");
        nec.a.getClass();
        B0 = new bc7[]{oi9Var};
    }

    public bl8(Context context) {
        super(context);
        this.A0 = new yj(12, this);
    }

    public void a(f53 f53Var) {
        setModel(f53Var);
    }

    public x38 getModel() {
        bc7 bc7Var = B0[0];
        return (x38) this.A0.b;
    }

    public void i(bsd bsdVar) {
        setModel(bsdVar);
    }

    @Override // defpackage.ppe, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iK;
        int iB;
        float f = 10;
        int iG = tu0.G(fk4.d().getDisplayMetrics().density * f);
        if (br7.H(getSenderNameViewStub$message_list_release().b)) {
            int iG2 = tu0.G(8 * fk4.d().getDisplayMetrics().density);
            getSenderNameViewStub$message_list_release().c(iG, iG2);
            iK = getSenderNameViewStub$message_list_release().a() + iG2;
        } else {
            iK = 0;
        }
        if (br7.H((je7) getSenderAliasDelegate().c) && br7.H(getSenderNameViewStub$message_list_release().b)) {
            getSenderAliasDelegate().T((getMeasuredWidth() - iG) - getSenderAliasDelegate().L(), rh4.c(8, fk4.d().getDisplayMetrics().density, (getSenderNameViewStub$message_list_release().a() / 2) - (getSenderAliasDelegate().K() / 2)));
        }
        if (br7.H((je7) getMessageLinkDelegate().c)) {
            int iG3 = iK + tu0.G((iK == 0 ? 8 : 4) * fk4.d().getDisplayMetrics().density);
            getMessageLinkDelegate().T(iG, iG3);
            iK = iG3 + getMessageLinkDelegate().K();
        }
        if (w()) {
            float f2 = 1;
            int iG4 = tu0.G(fk4.d().getDisplayMetrics().density * f2) + (iK == 0 ? 0 : rh4.c(8, fk4.d().getDisplayMetrics().density, iK));
            int iC = rh4.c(6, fk4.d().getDisplayMetrics().density, b(tu0.G(f2 * fk4.d().getDisplayMetrics().density), iG4) + iG4);
            ote.E(getMessageTextView$message_list_release(), iG, iC, 0, 12);
            iB = rh4.c(8, fk4.d().getDisplayMetrics().density, getMessageTextView$message_list_release().getMeasuredHeight() + iC);
        } else {
            int iC2 = rh4.c(8, fk4.d().getDisplayMetrics().density, iK);
            ote.E(getMessageTextView$message_list_release(), iG, iC2, 0, 12);
            float f3 = 1;
            int iD = wg0.d(f3, fk4.d().getDisplayMetrics().density, tu0.G(6 * fk4.d().getDisplayMetrics().density), getMessageTextView$message_list_release().getMeasuredHeight() + iC2);
            iB = iD + b(tu0.G(f3 * fk4.d().getDisplayMetrics().density), iD);
        }
        int measuredWidth = getMeasuredWidth() - getDate$message_list_release().getMeasuredWidth();
        if (!w()) {
            f = 4;
        }
        ote.E(getDate$message_list_release(), measuredWidth - tu0.G(f * fk4.d().getDisplayMetrics().density), ((w() ? getMeasuredHeight() : iB) - getDate$message_list_release().getMeasuredHeight()) - getStatusBottomMargin$message_list_release(), 0, 12);
        if (br7.H((je7) getReactionsDelegate().c) && w()) {
            getReactionsDelegate().T(iG, iB);
        } else if (br7.H((je7) getReactionsDelegate().c)) {
            getReactionsDelegate().T(getReactionsDelegate().Z ? getMeasuredWidth() - getReactionsDelegate().L() : 0, rh4.c(4, fk4.d().getDisplayMetrics().density, iB));
        }
    }

    @Override // defpackage.ppe, android.view.View
    public final void onMeasure(int i, int i2) {
        int iK;
        float f = 10;
        int iM = wg0.m(f, fk4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        getMessageTextView$message_list_release().h();
        int size = getDependOnOutsideView() ? View.MeasureSpec.getSize(i) : Math.max(rh4.c(f, fk4.d().getDisplayMetrics().density, getSuggestedMinimumWidth()), (tu0.G(fk4.d().getDisplayMetrics().density * f) * 2) + getMessageTextView$message_list_release().getMeasuredWidth());
        if (br7.H((je7) getSenderAliasDelegate().c) && br7.H(getSenderNameViewStub$message_list_release().b)) {
            getSenderAliasDelegate().U(View.MeasureSpec.makeMeasureSpec(iM, Integer.MIN_VALUE), i2);
            size = Math.max(size, getSenderAliasDelegate().L());
        }
        int iG = 0;
        if (br7.H(getSenderNameViewStub$message_list_release().b)) {
            getSenderNameViewStub$message_list_release().d(View.MeasureSpec.makeMeasureSpec(iM, Integer.MIN_VALUE), i2);
            size = Math.max(size, (tu0.G(fk4.d().getDisplayMetrics().density * f) * 2) + getSenderNameViewStub$message_list_release().b() + getSenderAliasDelegate().h0());
            iK = getSenderNameViewStub$message_list_release().a() + tu0.G(8 * fk4.d().getDisplayMetrics().density);
        } else {
            iK = 0;
        }
        if (br7.H((je7) getMessageLinkDelegate().c)) {
            getMessageLinkDelegate().U(View.MeasureSpec.makeMeasureSpec(iM, Integer.MIN_VALUE), i2);
            size = Math.max(size, (tu0.G(fk4.d().getDisplayMetrics().density * f) * 2) + getMessageLinkDelegate().L());
            iK += getMessageLinkDelegate().K() + tu0.G((iK == 0 ? 8 : 4) * fk4.d().getDisplayMetrics().density);
        }
        if (iK != 0 && w()) {
            iG = tu0.G(8 * fk4.d().getDisplayMetrics().density);
        }
        int iD = iK + iG;
        getDate$message_list_release().measure(i, i2);
        if (br7.H((je7) getReactionsDelegate().c) && w()) {
            getReactionsDelegate().U(View.MeasureSpec.makeMeasureSpec(iM, Integer.MIN_VALUE), i2);
            size = Math.max(size, (tu0.G(fk4.d().getDisplayMetrics().density * f) * 2) + getReactionsDelegate().L());
            iD = wg0.d(f, fk4.d().getDisplayMetrics().density, getReactionsDelegate().K(), iD);
        } else if (br7.H((je7) getReactionsDelegate().c)) {
            getReactionsDelegate().U(View.MeasureSpec.makeMeasureSpec(iM, Integer.MIN_VALUE), i2);
            size = Math.max(size, getReactionsDelegate().L());
            int iC = rh4.c(8, fk4.d().getDisplayMetrics().density, getReactionsDelegate().K() + tu0.G(4 * fk4.d().getDisplayMetrics().density));
            iD += iC;
            ((vs8) getBackground()).w = iC;
        } else {
            ((vs8) getBackground()).w = 0.0f;
        }
        int iMax = Math.max(size, (tu0.G(fk4.d().getDisplayMetrics().density * f) * 2) + getMessageTextView$message_list_release().getMeasuredWidth());
        float f2 = 6;
        int iD2 = wg0.d(8, fk4.d().getDisplayMetrics().density, getMessageTextView$message_list_release().getMeasuredHeight() + tu0.G(fk4.d().getDisplayMetrics().density * f2), iD);
        if (w()) {
            int iL = br7.H((je7) getReactionsDelegate().c) ? getReactionsDelegate().L() : getMessageTextView$message_list_release().e(iM);
            int measuredWidth = getDate$message_list_release().getMeasuredWidth() + tu0.G(f2 * fk4.d().getDisplayMetrics().density);
            if (iM - iL < measuredWidth) {
                iD2 = rh4.c(12, fk4.d().getDisplayMetrics().density, iD2);
            } else if ((iMax - (tu0.G(fk4.d().getDisplayMetrics().density * f) * 2)) - iL < measuredWidth) {
                iMax += measuredWidth - ((iMax - (tu0.G(f * fk4.d().getDisplayMetrics().density) * 2)) - iL);
            }
        }
        float f3 = 1;
        long jT = t(iMax, wg0.m(f3, fk4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i)), i, i2);
        setMeasuredDimension(Math.max(iMax, (tu0.G(fk4.d().getDisplayMetrics().density * f3) * 2) + ((int) (jT >> 32))), (tu0.G(f3 * fk4.d().getDisplayMetrics().density) * 2) + ((int) (jT & 4294967295L)) + iD2);
    }

    public void p(vqd vqdVar) {
        setModel(vqdVar);
    }

    public void setModel(x38 x38Var) {
        this.A0.o1(this, B0[0], x38Var);
    }

    public final boolean w() {
        x38 model = getModel();
        return model != null && model.c();
    }

    public final void x(is0 is0Var) {
        if (w()) {
            getDate$message_list_release().setTextColor$message_list_release(is0Var.d.m);
        }
    }
}

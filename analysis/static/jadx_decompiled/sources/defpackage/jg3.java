package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class jg3 extends RecyclerView implements kre, g17 {
    public static final /* synthetic */ bc7[] c2 = {new oi9(jg3.class, "state", "getState()Lone/me/sdk/codeinput/ConfirmSmsInputView$State;"), rh4.g(nec.a, jg3.class, "countCells", "getCountCells()I")};
    public boolean V1;
    public fg3 W1;
    public final hg3 X1;
    public k56 Y1;
    public final hg3 Z1;
    public m56 a2;
    public final bud b2;

    public jg3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.V1 = true;
        gg3 gg3Var = gg3.SUCCESS;
        this.X1 = new hg3(this, 0);
        this.Y1 = new a5(context, 28);
        this.Z1 = new hg3(this, 1);
        this.b2 = new bud(lnf.b(this));
        setLayoutManager(new LinearLayoutManager(0, false));
        j(new kq(4));
    }

    public static ArrayList G0(jg3 jg3Var) {
        jg3Var.getClass();
        ArrayList arrayList = new ArrayList();
        int childCount = jg3Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            l17 l17VarH0 = jg3Var.H0(i);
            if (l17VarH0 != null) {
                arrayList.add(l17VarH0);
            }
        }
        return arrayList;
    }

    private final l17 getFirstEmptyInputController() {
        Object next;
        Iterator it = G0(this).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ptd) ((l17) next)).A().length() == 0) {
                break;
            }
        }
        return (l17) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInputsEnabled(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            l17 l17VarH0 = H0(i);
            if (l17VarH0 != null) {
                ptd ptdVar = (ptd) l17VarH0;
                eg3 eg3Var = ptdVar.H0;
                if (!z && ((Boolean) ptdVar.I0.Y.invoke()).booleanValue()) {
                    mr0.I(eg3Var);
                }
                eg3Var.setClickable(z);
                eg3Var.setFocusable(z);
                eg3Var.setFocusableInTouchMode(z);
            }
        }
    }

    public final l17 H0(int i) {
        Object objM = M(i);
        if (objM instanceof l17) {
            return (l17) objM;
        }
        return null;
    }

    public final boolean I0(int i) {
        return i >= 0 && i <= getCountCells();
    }

    public final void J0(int i, String str) {
        if (I0(i) && I0(str.length())) {
            int length = str.length();
            for (int i2 = i; i2 < length; i2++) {
                int i3 = i2 - i;
                l17 l17VarH0 = H0(i2);
                if (l17VarH0 != null) {
                    ((ptd) l17VarH0).B(String.valueOf(w9e.w0(i3, str)));
                }
            }
        }
    }

    public final boolean K0() {
        l17 firstEmptyInputController = getFirstEmptyInputController();
        Boolean boolValueOf = firstEmptyInputController != null ? Boolean.valueOf(((ptd) firstEmptyInputController).H0.requestFocus()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    public final void L0() {
        l17 firstEmptyInputController = getFirstEmptyInputController();
        if (firstEmptyInputController != null) {
            mr0.V(((ptd) firstEmptyInputController).H0);
        }
    }

    public final int getCountCells() {
        bc7 bc7Var = c2[1];
        return ((Number) this.Z1.b).intValue();
    }

    public final boolean getDisableInputsForError() {
        return this.V1;
    }

    public final fg3 getListener() {
        return this.W1;
    }

    public final m56 getOnAnimationEnded() {
        return this.a2;
    }

    public final gg3 getState() {
        bc7 bc7Var = c2[0];
        return (gg3) this.X1.b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        bud budVar = this.b2;
        budVar.b();
        bc7[] bc7VarArr = bud.e;
        bc7 bc7Var = bc7VarArr[1];
        w4d w4dVar = budVar.d;
        x77 x77Var = (x77) w4dVar.T0(budVar, bc7Var);
        if (x77Var != null) {
            x77Var.cancel(null);
        }
        w4dVar.o1(budVar, bc7VarArr[1], null);
        super.onDetachedFromWindow();
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        int iC = qp4.u0.j(this).c(getState().a);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            l17 l17VarH0 = H0(i);
            if (l17VarH0 != null) {
                eg3 eg3Var = ((ptd) l17VarH0).H0;
                eg3 eg3Var2 = eg3Var instanceof kre ? eg3Var : null;
                if (eg3Var2 != null) {
                    eg3Var2.onThemeChanged(fkaVar);
                }
                eg3Var.setTextColor(iC);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        return K0();
    }

    public final void setCountCells(int i) {
        this.Z1.o1(this, c2[1], Integer.valueOf(i));
    }

    public final void setDisableInputsForError(boolean z) {
        this.V1 = z;
    }

    public final void setKeyboardOpen(k56 k56Var) {
        this.Y1 = k56Var;
    }

    public final void setListener(fg3 fg3Var) {
        this.W1 = fg3Var;
    }

    public final void setOnAnimationEnded(m56 m56Var) {
        this.a2 = m56Var;
    }

    public final void setSecure(boolean z) {
        hdc adapter = getAdapter();
        qtd qtdVar = adapter instanceof qtd ? (qtd) adapter : null;
        if (qtdVar != null) {
            qtdVar.Z.o1(qtdVar, qtd.s0[0], Boolean.valueOf(z));
        }
    }

    public final void setState(gg3 gg3Var) {
        this.X1.o1(this, c2[0], gg3Var);
    }
}

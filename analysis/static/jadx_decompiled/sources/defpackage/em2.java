package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public final class em2 implements i8e {
    public final /* synthetic */ int a;
    public final m56 b;

    public /* synthetic */ em2(int i, m56 m56Var) {
        this.a = i;
        this.b = m56Var;
    }

    @Override // defpackage.i8e
    public final Object a(int i) {
        switch (this.a) {
            case 0:
                if (i < 0) {
                    return null;
                }
                return (CharSequence) this.b.invoke(Integer.valueOf(i));
            case 1:
                if (i < 0) {
                    return null;
                }
                return (CharSequence) this.b.invoke(Integer.valueOf(i));
            case 2:
                if (i < 0) {
                    return null;
                }
                return (CharSequence) this.b.invoke(Integer.valueOf(i));
            case 3:
                if (i < 0) {
                    return null;
                }
                return (CharSequence) this.b.invoke(Integer.valueOf(i));
            case 4:
                return d(i);
            default:
                if (i < 0) {
                    return null;
                }
                return (CharSequence) this.b.invoke(Integer.valueOf(i));
        }
    }

    @Override // defpackage.i8e
    public final c8e b(ViewGroup viewGroup) {
        switch (this.a) {
            case 0:
                return new dm2(new TextView(viewGroup.getContext()));
            case 1:
                return new nz2(new TextView(viewGroup.getContext()));
            case 2:
                return new ks3(new AppCompatTextView(viewGroup.getContext(), null));
            case 3:
                return new f57(new AppCompatTextView(viewGroup.getContext(), null));
            case 4:
                return new uf7(new AppCompatTextView(viewGroup.getContext(), null, 0));
            default:
                FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                frameLayout.addView(new AppCompatTextView(viewGroup.getContext(), null));
                return new r7c(frameLayout);
        }
    }

    @Override // defpackage.i8e
    public final void c(c8e c8eVar, int i) {
        switch (this.a) {
            case 0:
                ((dm2) c8eVar).o.setText((CharSequence) a(i));
                break;
            case 1:
                ((nz2) c8eVar).o.setText((CharSequence) a(i));
                break;
            case 2:
                ((ks3) c8eVar).o.setText((CharSequence) a(i));
                break;
            case 3:
                ((f57) c8eVar).o.setText((CharSequence) a(i));
                break;
            case 4:
                Character chD = d(i);
                TextView textView = ((uf7) c8eVar).o;
                if (chD == null) {
                    textView.setText((CharSequence) null);
                    break;
                } else {
                    textView.setText(new char[]{chD.charValue()}, 0, 1);
                    break;
                }
            default:
                CharSequence charSequence = (CharSequence) a(i);
                TextView textView2 = ((r7c) c8eVar).o;
                textView2.setText(charSequence);
                textView2.setTextSize(1, 14.0f);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Character d(int r2) {
        /*
            r1 = this;
            r0 = 0
            if (r2 >= 0) goto L4
            return r0
        L4:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            m56 r1 = r1.b
            java.lang.Object r1 = r1.invoke(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 != 0) goto L13
            return r0
        L13:
            java.lang.Character r1 = defpackage.w9e.u0(r1)
            if (r1 == 0) goto L2f
            char r2 = r1.charValue()
            boolean r2 = java.lang.Character.isLetter(r2)
            if (r2 == 0) goto L24
            r0 = r1
        L24:
            if (r0 == 0) goto L2f
            char r1 = r0.charValue()
            char r1 = java.lang.Character.toUpperCase(r1)
            goto L31
        L2f:
            r1 = 35
        L31:
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.em2.d(int):java.lang.Character");
    }
}

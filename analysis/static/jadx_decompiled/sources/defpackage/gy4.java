package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.Spannable;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class gy4 implements lx4 {
    public final adb a;
    public final Context b;
    public final String c = gy4.class.getName();
    public final kld d;
    public final mn5 e;
    public final khe f;
    public final ConcurrentHashMap g;

    public gy4(adb adbVar, Context context, je7 je7Var) {
        this.a = adbVar;
        this.b = context;
        kld kldVarB = lld.b(0, 1, 2, 1);
        this.d = kldVarB;
        this.e = od2.u(new v7c(kldVarB), 100L);
        this.f = new khe(new yf3(je7Var, 3, this));
        this.g = new ConcurrentHashMap(25);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(View view) {
        if (view == 0 || view.getVisibility() != 0) {
            return;
        }
        if (view instanceof hx4) {
            ((hx4) view).d();
            return;
        }
        dvd[] dvdVarArr = null;
        spans = null;
        Object[] spans = null;
        int i = 0;
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            int childCount = recyclerView.getChildCount();
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != null) {
                    dec decVarT = recyclerView.T(childAt);
                    hx4 hx4Var = decVarT instanceof hx4 ? (hx4) decVarT : null;
                    if (hx4Var == null) {
                        c(childAt);
                    } else {
                        hx4Var.d();
                    }
                }
                i++;
            }
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount2 = viewGroup.getChildCount();
            while (i < childCount2) {
                c(viewGroup.getChildAt(i));
                i++;
            }
            return;
        }
        if (view instanceof EditText) {
            ((EditText) view).requestLayout();
            return;
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            CharSequence text = textView.getText();
            if (text instanceof Spannable) {
                int length = text.length();
                try {
                    Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
                    if (spanned != null) {
                        spans = spanned.getSpans(0, length, dvd.class);
                    }
                } catch (Throwable unused) {
                }
                dvdVarArr = (dvd[]) spans;
            }
            if (dvdVarArr == null) {
                return;
            }
            int length2 = dvdVarArr.length;
            while (i < length2) {
                if (dvdVarArr[i].b() instanceof mwd) {
                    textView.invalidate();
                }
                i++;
            }
        }
    }

    @Override // defpackage.lx4
    public final mn5 a() {
        return this.e;
    }

    @Override // defpackage.lx4
    public final void b(Activity activity) {
        View viewFindViewById = activity.findViewById(R.id.content);
        if (viewFindViewById == null) {
            return;
        }
        c(viewFindViewById);
    }
}

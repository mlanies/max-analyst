package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class tc extends fn implements DialogInterface {
    public final rc Y;

    public tc(Context context, int i) {
        super(context, g(context, i));
        this.Y = new rc(getContext(), this, getWindow());
    }

    public static int g(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(vsb.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.fn, defpackage.ac3, android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        rc rcVar = this.Y;
        rcVar.b.setContentView(rcVar.F);
        int i2 = mvb.parentPanel;
        Window window = rcVar.c;
        View viewFindViewById2 = window.findViewById(i2);
        View viewFindViewById3 = viewFindViewById2.findViewById(mvb.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(mvb.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(mvb.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(mvb.customPanel);
        View viewInflate = rcVar.h;
        Context context = rcVar.a;
        if (viewInflate == null) {
            viewInflate = rcVar.i != 0 ? LayoutInflater.from(context).inflate(rcVar.i, viewGroup, false) : null;
        }
        boolean z = viewInflate != null;
        if (!z || !rc.a(viewInflate)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(mvb.custom);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (rcVar.j) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (rcVar.g != null) {
                ((LinearLayout.LayoutParams) ((rh7) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(mvb.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(mvb.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(mvb.buttonPanel);
        ViewGroup viewGroupB = rc.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = rc.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = rc.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(mvb.scrollView);
        rcVar.w = nestedScrollView;
        nestedScrollView.setFocusable(false);
        rcVar.w.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(R.id.message);
        rcVar.B = textView;
        if (textView != null) {
            CharSequence charSequence = rcVar.f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                rcVar.w.removeView(rcVar.B);
                if (rcVar.g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) rcVar.w.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(rcVar.w);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(rcVar.g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupB2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupB3.findViewById(R.id.button1);
        rcVar.k = button;
        e0d e0dVar = rcVar.L;
        button.setOnClickListener(e0dVar);
        boolean zIsEmpty = TextUtils.isEmpty(rcVar.l);
        int i3 = rcVar.d;
        if (zIsEmpty && rcVar.n == null) {
            rcVar.k.setVisibility(8);
            i = 0;
        } else {
            rcVar.k.setText(rcVar.l);
            Drawable drawable = rcVar.n;
            if (drawable != null) {
                drawable.setBounds(0, 0, i3, i3);
                rcVar.k.setCompoundDrawables(rcVar.n, null, null, null);
            }
            rcVar.k.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroupB3.findViewById(R.id.button2);
        rcVar.o = button2;
        button2.setOnClickListener(e0dVar);
        if (TextUtils.isEmpty(rcVar.p) && rcVar.r == null) {
            rcVar.o.setVisibility(8);
        } else {
            rcVar.o.setText(rcVar.p);
            Drawable drawable2 = rcVar.r;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i3, i3);
                rcVar.o.setCompoundDrawables(rcVar.r, null, null, null);
            }
            rcVar.o.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroupB3.findViewById(R.id.button3);
        rcVar.s = button3;
        button3.setOnClickListener(e0dVar);
        if (TextUtils.isEmpty(rcVar.t) && rcVar.v == null) {
            rcVar.s.setVisibility(8);
        } else {
            rcVar.s.setText(rcVar.t);
            Drawable drawable3 = rcVar.v;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i3, i3);
                rcVar.s.setCompoundDrawables(rcVar.v, null, null, null);
            }
            rcVar.s.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(vsb.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = rcVar.k;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = rcVar.o;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = rcVar.s;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (rcVar.C != null) {
            viewGroupB.addView(rcVar.C, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(mvb.title_template).setVisibility(8);
        } else {
            rcVar.z = (ImageView) window.findViewById(R.id.icon);
            if ((!TextUtils.isEmpty(rcVar.e)) && rcVar.J) {
                TextView textView2 = (TextView) window.findViewById(mvb.alertTitle);
                rcVar.A = textView2;
                textView2.setText(rcVar.e);
                int i4 = rcVar.x;
                if (i4 != 0) {
                    rcVar.z.setImageResource(i4);
                } else {
                    Drawable drawable4 = rcVar.y;
                    if (drawable4 != null) {
                        rcVar.z.setImageDrawable(drawable4);
                    } else {
                        rcVar.A.setPadding(rcVar.z.getPaddingLeft(), rcVar.z.getPaddingTop(), rcVar.z.getPaddingRight(), rcVar.z.getPaddingBottom());
                        rcVar.z.setVisibility(8);
                    }
                }
            } else {
                window.findViewById(mvb.title_template).setVisibility(8);
                rcVar.z.setVisibility(8);
                viewGroupB.setVisibility(8);
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i5 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupB3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupB2.findViewById(mvb.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i5 != 0) {
            NestedScrollView nestedScrollView2 = rcVar.w;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (rcVar.f == null && rcVar.g == null) ? null : viewGroupB.findViewById(mvb.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(mvb.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = rcVar.g;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z3 || i5 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i5 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.b);
            }
        }
        if (!z2) {
            View view = rcVar.g;
            if (view == null) {
                view = rcVar.w;
            }
            if (view != null) {
                int i6 = i5 | (z3 ? 2 : 0);
                View viewFindViewById11 = window.findViewById(mvb.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(mvb.scrollIndicatorDown);
                WeakHashMap weakHashMap = zmf.a;
                pmf.d(view, i6, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = rcVar.g;
        if (alertController$RecycleListView2 == null || (listAdapter = rcVar.D) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i7 = rcVar.E;
        if (i7 > -1) {
            alertController$RecycleListView2.setItemChecked(i7, true);
            alertController$RecycleListView2.setSelection(i7);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.Y.w;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.Y.w;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.fn, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        rc rcVar = this.Y;
        rcVar.e = charSequence;
        TextView textView = rcVar.A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}

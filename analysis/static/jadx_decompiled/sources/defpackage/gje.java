package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class gje extends LinearLayout {
    public static final /* synthetic */ int z0 = 0;
    public eje a;
    public TextView b;
    public ImageView c;
    public View o;
    public bg0 s0;
    public View t0;
    public TextView u0;
    public ImageView v0;
    public Drawable w0;
    public int x0;
    public final /* synthetic */ TabLayout y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gje(TabLayout tabLayout, Context context) {
        super(context);
        this.y0 = tabLayout;
        this.x0 = 2;
        f(context);
        int i = tabLayout.s0;
        WeakHashMap weakHashMap = zmf.a;
        setPaddingRelative(i, tabLayout.t0, tabLayout.u0, tabLayout.v0);
        setGravity(17);
        setOrientation(!tabLayout.R0 ? 1 : 0);
        setClickable(true);
        qmf.d(this, g5b.b(getContext(), 1002));
    }

    private bg0 getBadge() {
        return this.s0;
    }

    private bg0 getOrCreateBadge() {
        if (this.s0 == null) {
            Context context = getContext();
            this.s0 = new bg0(bg0.z0, bg0.y0, context);
        }
        c();
        bg0 bg0Var = this.s0;
        if (bg0Var != null) {
            return bg0Var;
        }
        throw new IllegalStateException("Unable to create badge");
    }

    public final void a(View view) {
        if (this.s0 == null || view == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
        bg0 bg0Var = this.s0;
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        bg0Var.setBounds(rect);
        bg0Var.h(view, null);
        if (bg0Var.c() != null) {
            bg0Var.c().setForeground(bg0Var);
        } else {
            view.getOverlay().add(bg0Var);
        }
        this.o = view;
    }

    public final void b() {
        if (this.s0 != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.o;
            if (view != null) {
                bg0 bg0Var = this.s0;
                if (bg0Var != null) {
                    if (bg0Var.c() != null) {
                        bg0Var.c().setForeground(null);
                    } else {
                        view.getOverlay().remove(bg0Var);
                    }
                }
                this.o = null;
            }
        }
    }

    public final void c() {
        eje ejeVar;
        if (this.s0 != null) {
            if (this.t0 != null) {
                b();
                return;
            }
            ImageView imageView = this.c;
            if (imageView != null && (ejeVar = this.a) != null && ejeVar.a != null) {
                if (this.o == imageView) {
                    d(imageView);
                    return;
                } else {
                    b();
                    a(this.c);
                    return;
                }
            }
            TextView textView = this.b;
            if (textView == null || this.a == null) {
                b();
            } else if (this.o == textView) {
                d(textView);
            } else {
                b();
                a(this.b);
            }
        }
    }

    public final void d(View view) {
        bg0 bg0Var = this.s0;
        if (bg0Var == null || view != this.o) {
            return;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        bg0Var.setBounds(rect);
        bg0Var.h(view, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.w0;
        if ((drawable == null || !drawable.isStateful()) ? false : this.w0.setState(drawableState)) {
            invalidate();
            this.y0.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r3 = this;
            r3.g()
            eje r0 = r3.a
            if (r0 == 0) goto L20
            com.google.android.material.tabs.TabLayout r1 = r0.f
            if (r1 == 0) goto L18
            int r1 = r1.getSelectedTabPosition()
            r2 = -1
            if (r1 == r2) goto L20
            int r0 = r0.d
            if (r1 != r0) goto L20
            r0 = 1
            goto L21
        L18:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Tab not attached to a TabLayout"
            r3.<init>(r0)
            throw r3
        L20:
            r0 = 0
        L21:
            r3.setSelected(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gje.e():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.graphics.drawable.RippleDrawable] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.view.View, gje] */
    public final void f(Context context) {
        TabLayout tabLayout = this.y0;
        int i = tabLayout.H0;
        if (i != 0) {
            Drawable drawableN = s36.n(context, i);
            this.w0 = drawableN;
            if (drawableN != null && drawableN.isStateful()) {
                this.w0.setState(getDrawableState());
            }
        } else {
            this.w0 = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        if (tabLayout.B0 != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList colorStateList = tabLayout.B0;
            int[] iArr = xfg.g;
            int iO = xfg.o(colorStateList, xfg.f);
            int[] iArr2 = xfg.e;
            ColorStateList colorStateList2 = new ColorStateList(new int[][]{iArr, iArr2, StateSet.NOTHING}, new int[]{iO, xfg.o(colorStateList, iArr2), xfg.o(colorStateList, xfg.d)});
            boolean z = tabLayout.V0;
            if (z) {
                gradientDrawable = null;
            }
            gradientDrawable = new RippleDrawable(colorStateList2, gradientDrawable, z ? null : gradientDrawable2);
        }
        WeakHashMap weakHashMap = zmf.a;
        setBackground(gradientDrawable);
        tabLayout.invalidate();
    }

    public final void g() {
        int i;
        ViewParent parent;
        eje ejeVar = this.a;
        View view = ejeVar != null ? ejeVar.e : null;
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.t0;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.t0);
                }
                addView(view);
            }
            this.t0 = view;
            TextView textView = this.b;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.c.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.u0 = textView2;
            if (textView2 != null) {
                this.x0 = textView2.getMaxLines();
            }
            this.v0 = (ImageView) view.findViewById(R.id.icon);
        } else {
            View view3 = this.t0;
            if (view3 != null) {
                removeView(view3);
                this.t0 = null;
            }
            this.u0 = null;
            this.v0 = null;
        }
        if (this.t0 == null) {
            if (this.c == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(vyb.design_layout_tab_icon, (ViewGroup) this, false);
                this.c = imageView2;
                addView(imageView2, 0);
            }
            if (this.b == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(vyb.design_layout_tab_text, (ViewGroup) this, false);
                this.b = textView3;
                addView(textView3);
                this.x0 = this.b.getMaxLines();
            }
            TextView textView4 = this.b;
            TabLayout tabLayout = this.y0;
            textView4.setTextAppearance(tabLayout.w0);
            if (!isSelected() || (i = tabLayout.y0) == -1) {
                this.b.setTextAppearance(tabLayout.x0);
            } else {
                this.b.setTextAppearance(i);
            }
            ColorStateList colorStateList = tabLayout.z0;
            if (colorStateList != null) {
                this.b.setTextColor(colorStateList);
            }
            h(this.b, this.c, true);
            c();
            ImageView imageView3 = this.c;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new hp1(this, imageView3));
            }
            TextView textView5 = this.b;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new hp1(this, textView5));
            }
        } else {
            TextView textView6 = this.u0;
            if (textView6 != null || this.v0 != null) {
                h(textView6, this.v0, false);
            }
        }
        if (ejeVar == null || TextUtils.isEmpty(ejeVar.c)) {
            return;
        }
        setContentDescription(ejeVar.c);
    }

    public int getContentHeight() {
        View[] viewArr = {this.b, this.c, this.t0};
        int iMax = 0;
        int iMin = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                iMin = z ? Math.min(iMin, view.getTop()) : view.getTop();
                iMax = z ? Math.max(iMax, view.getBottom()) : view.getBottom();
                z = true;
            }
        }
        return iMax - iMin;
    }

    public int getContentWidth() {
        View[] viewArr = {this.b, this.c, this.t0};
        int iMax = 0;
        int iMin = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                iMin = z ? Math.min(iMin, view.getLeft()) : view.getLeft();
                iMax = z ? Math.max(iMax, view.getRight()) : view.getRight();
                z = true;
            }
        }
        return iMax - iMin;
    }

    public eje getTab() {
        return this.a;
    }

    public final void h(TextView textView, ImageView imageView, boolean z) {
        Drawable drawable;
        eje ejeVar = this.a;
        Drawable drawableMutate = (ejeVar == null || (drawable = ejeVar.a) == null) ? null : drawable.mutate();
        TabLayout tabLayout = this.y0;
        if (drawableMutate != null) {
            aq4.h(drawableMutate, tabLayout.A0);
            PorterDuff.Mode mode = tabLayout.E0;
            if (mode != null) {
                aq4.i(drawableMutate, mode);
            }
        }
        eje ejeVar2 = this.a;
        CharSequence charSequence = ejeVar2 != null ? ejeVar2.b : null;
        if (imageView != null) {
            if (drawableMutate != null) {
                imageView.setImageDrawable(drawableMutate);
                imageView.setVisibility(0);
                setVisibility(0);
            } else {
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
            }
        }
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (z3) {
                this.a.getClass();
            } else {
                z2 = false;
            }
            textView.setText(z3 ? charSequence : null);
            textView.setVisibility(z2 ? 0 : 8);
            if (z3) {
                setVisibility(0);
            }
        } else {
            z2 = false;
        }
        if (z && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int iH = (z2 && imageView.getVisibility() == 0) ? (int) mqd.h(getContext(), 8) : 0;
            if (tabLayout.R0) {
                if (iH != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(iH);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (iH != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iH;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        eje ejeVar3 = this.a;
        CharSequence charSequence2 = ejeVar3 != null ? ejeVar3.c : null;
        if (!z3) {
            charSequence = charSequence2;
        }
        swe.a(this, charSequence);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r8) {
        /*
            r7 = this;
            super.onInitializeAccessibilityNodeInfo(r8)
            bg0 r0 = r7.s0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L81
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L81
            bg0 r0 = r7.s0
            boolean r3 = r0.isVisible()
            r4 = 0
            if (r3 != 0) goto L1a
            goto L7e
        L1a:
            dg0 r3 = r0.X
            cg0 r3 = r3.b
            java.lang.String r5 = r3.u0
            if (r5 == 0) goto L24
            r6 = r2
            goto L25
        L24:
            r6 = r1
        L25:
            if (r6 == 0) goto L2f
            java.lang.CharSequence r0 = r3.z0
            if (r0 == 0) goto L2d
            r4 = r0
            goto L7e
        L2d:
            r4 = r5
            goto L7e
        L2f:
            boolean r5 = r0.f()
            if (r5 == 0) goto L7c
            int r5 = r3.B0
            if (r5 == 0) goto L7e
            java.lang.ref.WeakReference r5 = r0.a
            java.lang.Object r5 = r5.get()
            android.content.Context r5 = (android.content.Context) r5
            if (r5 != 0) goto L44
            goto L7e
        L44:
            int r4 = r0.s0
            r6 = -2
            if (r4 == r6) goto L61
            int r4 = r0.d()
            int r6 = r0.s0
            if (r4 > r6) goto L52
            goto L61
        L52:
            int r0 = r3.C0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = r5.getString(r0, r3)
            goto L7e
        L61:
            android.content.res.Resources r4 = r5.getResources()
            int r3 = r3.B0
            int r5 = r0.d()
            int r0 = r0.d()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r4 = r4.getQuantityString(r3, r5, r0)
            goto L7e
        L7c:
            java.lang.CharSequence r4 = r3.A0
        L7e:
            r8.setContentDescription(r4)
        L81:
            eje r0 = r7.a
            int r0 = r0.d
            boolean r3 = r7.isSelected()
            k4 r0 = defpackage.k4.a(r3, r1, r2, r0, r2)
            java.lang.Object r0 = r0.a
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) r0
            r8.setCollectionItemInfo(r0)
            boolean r0 = r7.isSelected()
            if (r0 == 0) goto La6
            r8.setClickable(r1)
            f4 r0 = defpackage.f4.e
            java.lang.Object r0 = r0.a
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r0
            r8.removeAction(r0)
        La6:
            android.content.res.Resources r7 = r7.getResources()
            int r0 = defpackage.wzb.item_view_role_description
            java.lang.String r7 = r7.getString(r0)
            android.os.Bundle r8 = r8.getExtras()
            java.lang.String r0 = "AccessibilityNodeInfo.roleDescription"
            r8.putCharSequence(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gje.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        TabLayout tabLayout = this.y0;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(tabLayout.I0, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.b != null) {
            float f = tabLayout.F0;
            int i3 = this.x0;
            ImageView imageView = this.c;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.b;
                if (textView != null && textView.getLineCount() > 1) {
                    f = tabLayout.G0;
                }
            } else {
                i3 = 1;
            }
            float textSize = this.b.getTextSize();
            int lineCount = this.b.getLineCount();
            int maxLines = this.b.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                if (tabLayout.Q0 == 1 && f > textSize && lineCount == 1) {
                    Layout layout = this.b.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                        return;
                    }
                }
                this.b.setTextSize(0, f);
                this.b.setMaxLines(i3);
                super.onMeasure(i, i2);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.a == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        eje ejeVar = this.a;
        TabLayout tabLayout = ejeVar.f;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tabLayout.o(ejeVar, true);
        return true;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.b;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.t0;
        if (view != null) {
            view.setSelected(z);
        }
    }

    public void setTab(eje ejeVar) {
        if (ejeVar != this.a) {
            this.a = ejeVar;
            e();
        }
    }
}

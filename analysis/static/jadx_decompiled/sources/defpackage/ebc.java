package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class ebc implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecordControlsWidget b;

    public /* synthetic */ ebc(RecordControlsWidget recordControlsWidget, int i) {
        this.a = i;
        this.b = recordControlsWidget;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        int i = 7;
        final int i2 = 1;
        int i3 = 8;
        int i4 = 6;
        final int i5 = 3;
        int i6 = 4;
        final int i7 = 0;
        e5f e5fVar = e5f.a;
        Continuation continuation = null;
        final RecordControlsWidget recordControlsWidget = this.b;
        switch (this.a) {
            case 0:
                LinearLayout linearLayout = (LinearLayout) obj;
                bc7[] bc7VarArr = RecordControlsWidget.b1;
                View view = new View(linearLayout.getContext());
                view.setId(lga.h);
                float f = 8;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                layoutParams.setMargins(tu0.G(20 * fk4.d().getDisplayMetrics().density), 0, tu0.G(10 * fk4.d().getDisplayMetrics().density), 0);
                layoutParams.gravity = 16;
                view.setLayoutParams(layoutParams);
                view.setBackground((GradientDrawable) recordControlsWidget.L0.getValue());
                v3c.y(new r1b(recordControlsWidget, continuation, 8), view);
                linearLayout.addView(view);
                ImageView imageView = new ImageView(linearLayout.getContext());
                imageView.setId(lga.r);
                float f2 = 36;
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f2));
                layoutParams2.gravity = 16;
                layoutParams2.leftMargin = tu0.G(6 * fk4.d().getDisplayMetrics().density);
                imageView.setLayoutParams(layoutParams2);
                float f3 = 4;
                rh4.p(f3, fk4.d().getDisplayMetrics().density, imageView);
                imageView.setImageResource(woc.x);
                imageView.setVisibility(8);
                linearLayout.addView(imageView);
                TextView textView = new TextView(linearLayout.getContext());
                textView.setId(lga.i);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams3.gravity = 16;
                layoutParams3.setMarginStart(tu0.G(f3 * fk4.d().getDisplayMetrics().density));
                textView.setLayoutParams(layoutParams3);
                i4f.l.b(textView, du4.b);
                v3c.y(new v9(i5, continuation, 21), textView);
                linearLayout.addView(textView);
                ebc ebcVar = new ebc(recordControlsWidget, i5);
                View frameLayout = new FrameLayout(linearLayout.getContext());
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(tu0.G(0 * fk4.d().getDisplayMetrics().density), -1);
                layoutParams4.weight = 1.0f;
                frameLayout.setLayoutParams(layoutParams4);
                ebcVar.invoke(frameLayout);
                linearLayout.addView(frameLayout);
                View space = new Space(linearLayout.getContext());
                space.setLayoutParams(new LinearLayout.LayoutParams((int) (tu0.G(f2 * fk4.d().getDisplayMetrics().density) * 1.45f), -2));
                linearLayout.addView(space);
                break;
            case 1:
                FrameLayout frameLayout2 = (FrameLayout) obj;
                bc7[] bc7VarArr2 = RecordControlsWidget.b1;
                if (recordControlsWidget.H0() == bac.b) {
                    lsf lsfVar = new lsf(frameLayout2.getContext());
                    lsfVar.setCallback(new y8(recordControlsWidget));
                    lsfVar.setDotDrawable((GradientDrawable) recordControlsWidget.L0.getValue());
                    recordControlsWidget.E0 = lsfVar;
                    frameLayout2.addView(lsfVar);
                }
                ImageView imageView2 = new ImageView(frameLayout2.getContext());
                imageView2.setId(lga.q);
                float f4 = 36;
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(fk4.d().getDisplayMetrics().density * f4));
                layoutParams5.gravity = 8388691;
                float f5 = 6;
                layoutParams5.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f5), 0, tu0.G(fk4.d().getDisplayMetrics().density * f5), tu0.G(fk4.d().getDisplayMetrics().density * f5));
                imageView2.setLayoutParams(layoutParams5);
                float f6 = 4;
                rh4.p(f6, fk4.d().getDisplayMetrics().density, imageView2);
                imageView2.setImageResource(woc.x);
                v3c.y(new ze2(i5, continuation, i3), imageView2);
                tu0.K(imageView2, 300L, new View.OnClickListener() { // from class: fbc
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        RecordControlsWidget recordControlsWidget2 = recordControlsWidget;
                        switch (i2) {
                            case 0:
                                bc7[] bc7VarArr3 = RecordControlsWidget.b1;
                                recordControlsWidget2.I0().A();
                                break;
                            case 1:
                                bc7[] bc7VarArr4 = RecordControlsWidget.b1;
                                cbc cbcVarI0 = recordControlsWidget2.I0();
                                cbcVarI0.C();
                                cbcVarI0.v0.m(null, new tac(2, cbcVarI0.x(), false));
                                break;
                            case 2:
                                bc7[] bc7VarArr5 = RecordControlsWidget.b1;
                                recordControlsWidget2.I0().z();
                                break;
                            default:
                                bc7[] bc7VarArr6 = RecordControlsWidget.b1;
                                cbc cbcVarI02 = recordControlsWidget2.I0();
                                bc7[] bc7VarArr7 = cbc.G0;
                                cbcVarI02.B(true);
                                break;
                        }
                    }
                });
                frameLayout2.addView(imageView2);
                ImageView imageView3 = new ImageView(frameLayout2.getContext());
                imageView3.setId(lga.m);
                FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(fk4.d().getDisplayMetrics().density * f4));
                layoutParams6.gravity = 81;
                layoutParams6.setMargins(((ViewGroup.MarginLayoutParams) layoutParams6).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams6).rightMargin, tu0.G(fk4.d().getDisplayMetrics().density * f5));
                imageView3.setLayoutParams(layoutParams6);
                rh4.p(f6, fk4.d().getDisplayMetrics().density, imageView3);
                ibc ibcVar = recordControlsWidget.F0;
                imageView3.setImageResource(ibcVar.b);
                v3c.y(new ze2(i5, continuation, 6), imageView3);
                final int i8 = 2;
                tu0.K(imageView3, 300L, new View.OnClickListener() { // from class: fbc
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        RecordControlsWidget recordControlsWidget2 = recordControlsWidget;
                        switch (i8) {
                            case 0:
                                bc7[] bc7VarArr3 = RecordControlsWidget.b1;
                                recordControlsWidget2.I0().A();
                                break;
                            case 1:
                                bc7[] bc7VarArr4 = RecordControlsWidget.b1;
                                cbc cbcVarI0 = recordControlsWidget2.I0();
                                cbcVarI0.C();
                                cbcVarI0.v0.m(null, new tac(2, cbcVarI0.x(), false));
                                break;
                            case 2:
                                bc7[] bc7VarArr5 = RecordControlsWidget.b1;
                                recordControlsWidget2.I0().z();
                                break;
                            default:
                                bc7[] bc7VarArr6 = RecordControlsWidget.b1;
                                cbc cbcVarI02 = recordControlsWidget2.I0();
                                bc7[] bc7VarArr7 = cbc.G0;
                                cbcVarI02.B(true);
                                break;
                        }
                    }
                });
                frameLayout2.addView(imageView3);
                ImageView imageView4 = new ImageView(frameLayout2.getContext());
                imageView4.setId(lga.o);
                FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(f4 * fk4.d().getDisplayMetrics().density));
                layoutParams7.gravity = 81;
                float f7 = 0;
                layoutParams7.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f7), tu0.G(fk4.d().getDisplayMetrics().density * f7), tu0.G(f7 * fk4.d().getDisplayMetrics().density), tu0.G(f5 * fk4.d().getDisplayMetrics().density));
                imageView4.setLayoutParams(layoutParams7);
                rh4.p(f6, fk4.d().getDisplayMetrics().density, imageView4);
                imageView4.setImageResource(ibcVar.c);
                v3c.y(new ze2(i5, continuation, 7), imageView4);
                imageView4.setVisibility(8);
                tu0.K(imageView4, 300L, new View.OnClickListener() { // from class: fbc
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        RecordControlsWidget recordControlsWidget2 = recordControlsWidget;
                        switch (i7) {
                            case 0:
                                bc7[] bc7VarArr3 = RecordControlsWidget.b1;
                                recordControlsWidget2.I0().A();
                                break;
                            case 1:
                                bc7[] bc7VarArr4 = RecordControlsWidget.b1;
                                cbc cbcVarI0 = recordControlsWidget2.I0();
                                cbcVarI0.C();
                                cbcVarI0.v0.m(null, new tac(2, cbcVarI0.x(), false));
                                break;
                            case 2:
                                bc7[] bc7VarArr5 = RecordControlsWidget.b1;
                                recordControlsWidget2.I0().z();
                                break;
                            default:
                                bc7[] bc7VarArr6 = RecordControlsWidget.b1;
                                cbc cbcVarI02 = recordControlsWidget2.I0();
                                bc7[] bc7VarArr7 = cbc.G0;
                                cbcVarI02.B(true);
                                break;
                        }
                    }
                });
                frameLayout2.addView(imageView4);
                break;
            case 2:
                FrameLayout frameLayout3 = (FrameLayout) obj;
                bc7[] bc7VarArr3 = RecordControlsWidget.b1;
                ebc ebcVar2 = new ebc(recordControlsWidget, i6);
                View frameLayout4 = new FrameLayout(frameLayout3.getContext());
                frameLayout4.setId(lga.c);
                FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams8.gravity = 17;
                frameLayout4.setLayoutParams(layoutParams8);
                ebcVar2.invoke(frameLayout4);
                frameLayout3.addView(frameLayout4);
                ImageView imageView5 = new ImageView(frameLayout3.getContext());
                imageView5.setId(lga.a);
                float f8 = 36;
                FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f8), tu0.G(f8 * fk4.d().getDisplayMetrics().density));
                layoutParams9.gravity = 17;
                imageView5.setLayoutParams(layoutParams9);
                rh4.p(4, fk4.d().getDisplayMetrics().density, imageView5);
                imageView5.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView5.setImageDrawable(recordControlsWidget.B0());
                tu0.K(imageView5, 300L, new View.OnClickListener() { // from class: fbc
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        RecordControlsWidget recordControlsWidget2 = recordControlsWidget;
                        switch (i5) {
                            case 0:
                                bc7[] bc7VarArr32 = RecordControlsWidget.b1;
                                recordControlsWidget2.I0().A();
                                break;
                            case 1:
                                bc7[] bc7VarArr4 = RecordControlsWidget.b1;
                                cbc cbcVarI0 = recordControlsWidget2.I0();
                                cbcVarI0.C();
                                cbcVarI0.v0.m(null, new tac(2, cbcVarI0.x(), false));
                                break;
                            case 2:
                                bc7[] bc7VarArr5 = RecordControlsWidget.b1;
                                recordControlsWidget2.I0().z();
                                break;
                            default:
                                bc7[] bc7VarArr6 = RecordControlsWidget.b1;
                                cbc cbcVarI02 = recordControlsWidget2.I0();
                                bc7[] bc7VarArr7 = cbc.G0;
                                cbcVarI02.B(true);
                                break;
                        }
                    }
                });
                v3c.y(new r1b(recordControlsWidget, continuation, i4), imageView5);
                frameLayout3.addView(imageView5);
                break;
            case 3:
                FrameLayout frameLayout5 = (FrameLayout) obj;
                bc7[] bc7VarArr4 = RecordControlsWidget.b1;
                TextView textView2 = new TextView(frameLayout5.getContext());
                textView2.setId(lga.g);
                FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-2, -1);
                layoutParams10.gravity = 17;
                textView2.setLayoutParams(layoutParams10);
                textView2.setGravity(17);
                textView2.setText(z7.B(recordControlsWidget.getContext(), recordControlsWidget.F0.d));
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((InsetDrawable) recordControlsWidget.I0.getValue(), (Drawable) null, (Drawable) null, (Drawable) null);
                i4f.p.b(textView2, du4.b);
                v3c.y(new r1b(recordControlsWidget, continuation, i), textView2);
                frameLayout5.addView(textView2);
                break;
            default:
                FrameLayout frameLayout6 = (FrameLayout) obj;
                bc7[] bc7VarArr5 = RecordControlsWidget.b1;
                View frameLayout7 = new FrameLayout(frameLayout6.getContext());
                frameLayout7.setId(lga.b);
                float f9 = 124;
                FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f9), tu0.G(fk4.d().getDisplayMetrics().density * f9));
                layoutParams11.gravity = 17;
                frameLayout7.setLayoutParams(layoutParams11);
                frameLayout7.setBackground((GradientDrawable) recordControlsWidget.J0.getValue());
                v3c.y(new jbc(recordControlsWidget, continuation, i2), frameLayout7);
                frameLayout6.addView(frameLayout7);
                View frameLayout8 = new FrameLayout(frameLayout6.getContext());
                FrameLayout.LayoutParams layoutParams12 = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f9), tu0.G(f9 * fk4.d().getDisplayMetrics().density));
                layoutParams12.gravity = 17;
                frameLayout8.setLayoutParams(layoutParams12);
                frameLayout8.setBackground((GradientDrawable) recordControlsWidget.K0.getValue());
                v3c.y(new jbc(recordControlsWidget, continuation, i7), frameLayout8);
                frameLayout6.addView(frameLayout8);
                break;
        }
        return e5fVar;
    }
}

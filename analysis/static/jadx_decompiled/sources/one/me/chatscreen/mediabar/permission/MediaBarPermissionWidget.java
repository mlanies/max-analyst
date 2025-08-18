package one.me.chatscreen.mediabar.permission;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.bc7;
import defpackage.eua;
import defpackage.fua;
import defpackage.hob;
import defpackage.hv1;
import defpackage.je7;
import defpackage.k56;
import defpackage.l48;
import defpackage.l5g;
import defpackage.m57;
import defpackage.nec;
import defpackage.nj4;
import defpackage.oec;
import defpackage.qm0;
import defpackage.u8a;
import defpackage.zr6;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/me/chatscreen/mediabar/permission/MediaBarPermissionWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "()V", "chat-screen_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class MediaBarPermissionWidget extends Widget {
    public static final /* synthetic */ bc7[] Z;
    public final qm0 X;
    public final qm0 Y;
    public final je7 a;
    public final je7 b;
    public final qm0 c;
    public final qm0 o;

    static {
        hob hobVar = new hob(MediaBarPermissionWidget.class, "noCameraPermissionContent", "getNoCameraPermissionContent()Landroid/widget/LinearLayout;", 0);
        oec oecVar = nec.a;
        Z = new bc7[]{hobVar, zr6.e(oecVar, MediaBarPermissionWidget.class, "cameraContent", "getCameraContent()Landroid/widget/FrameLayout;", 0), zr6.f(MediaBarPermissionWidget.class, "permissionContent", "getPermissionContent()Landroid/widget/LinearLayout;", 0, oecVar)};
    }

    public MediaBarPermissionWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = fua.a.b();
        this.b = createViewModelLazy(l48.class, new nj4(20, new m57(25)));
        final int i = 0;
        this.c = binding(new k56(this) { // from class: m48
            public final /* synthetic */ MediaBarPermissionWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                int i2 = 17;
                int i3 = 0;
                int i4 = 16;
                Continuation continuation = null;
                int i5 = 1;
                MediaBarPermissionWidget mediaBarPermissionWidget = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = MediaBarPermissionWidget.Z;
                        LinearLayout linearLayout = new LinearLayout(mediaBarPermissionWidget.getContext());
                        linearLayout.setOrientation(1);
                        linearLayout.setVerticalGravity(16);
                        linearLayout.setHorizontalGravity(1);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        float f = 4;
                        layoutParams.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(24 * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                        linearLayout.setLayoutParams(layoutParams);
                        Drawable drawableB = kt3.b(linearLayout.getContext(), s8a.e);
                        AppCompatImageView appCompatImageView = new AppCompatImageView(linearLayout.getContext(), null);
                        appCompatImageView.setImageDrawable(drawableB);
                        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext(), null);
                        appCompatTextView.setText(u8a.M);
                        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), tu0.G(10 * fk4.d().getDisplayMetrics().density), appCompatTextView.getPaddingRight(), appCompatTextView.getPaddingBottom());
                        i4f.D.b(appCompatTextView, du4.b);
                        v3c.y(new c3(drawableB, appCompatTextView, continuation, i4), linearLayout);
                        linearLayout.addView(appCompatImageView);
                        linearLayout.addView(appCompatTextView);
                        tu0.K(linearLayout, 300L, new n48(mediaBarPermissionWidget, i3));
                        return linearLayout;
                    case 1:
                        bc7[] bc7VarArr2 = MediaBarPermissionWidget.Z;
                        CameraxCameraApiView cameraxCameraApiView = new CameraxCameraApiView(mediaBarPermissionWidget.getContext(), null, 14);
                        cameraxCameraApiView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        cameraxCameraApiView.e();
                        return cameraxCameraApiView;
                    case 2:
                        bc7[] bc7VarArr3 = MediaBarPermissionWidget.Z;
                        FrameLayout frameLayout = new FrameLayout(mediaBarPermissionWidget.getContext());
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, tu0.G(138 * fk4.d().getDisplayMetrics().density));
                        float f2 = 12;
                        layoutParams2.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(4 * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(8 * fk4.d().getDisplayMetrics().density));
                        frameLayout.setLayoutParams(layoutParams2);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(fk4.d().getDisplayMetrics().density * 12.0f);
                        frameLayout.setBackground(gradientDrawable);
                        frameLayout.setClipToOutline(true);
                        v3c.y(new o48(gradientDrawable, continuation, i3), frameLayout);
                        i24.s(new zn5(((l48) mediaBarPermissionWidget.b.getValue()).c, new p48(mediaBarPermissionWidget, frameLayout, null), 5), mediaBarPermissionWidget.getViewLifecycleScope());
                        return frameLayout;
                    default:
                        bc7[] bc7VarArr4 = MediaBarPermissionWidget.Z;
                        LinearLayout linearLayout2 = new LinearLayout(mediaBarPermissionWidget.getContext());
                        linearLayout2.setOrientation(1);
                        linearLayout2.setVerticalGravity(16);
                        linearLayout2.setHorizontalGravity(1);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, tu0.G(166 * fk4.d().getDisplayMetrics().density));
                        float f3 = 20;
                        float f4 = 0;
                        layoutParams3.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(f3 * fk4.d().getDisplayMetrics().density), tu0.G(f4 * fk4.d().getDisplayMetrics().density));
                        linearLayout2.setLayoutParams(layoutParams3);
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout2.getContext(), null);
                        appCompatTextView2.setText(u8a.S);
                        i4f.o.b(appCompatTextView2, du4.b);
                        appCompatTextView2.setGravity(17);
                        AppCompatTextView appCompatTextView3 = new AppCompatTextView(linearLayout2.getContext(), null);
                        appCompatTextView3.setText(u8a.R);
                        i4f.s.b(appCompatTextView3, du4.b);
                        appCompatTextView3.setPadding(appCompatTextView3.getPaddingLeft(), tu0.G(4 * fk4.d().getDisplayMetrics().density), appCompatTextView3.getPaddingRight(), tu0.G(16 * fk4.d().getDisplayMetrics().density));
                        appCompatTextView3.setGravity(17);
                        OneMeButton oneMeButton = new OneMeButton(linearLayout2.getContext(), null);
                        oneMeButton.setText(u8a.L);
                        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        tu0.K(oneMeButton, 300L, new n48(mediaBarPermissionWidget, i5));
                        v3c.y(new c3(appCompatTextView2, appCompatTextView3, continuation, i2), linearLayout2);
                        linearLayout2.addView(appCompatTextView2);
                        linearLayout2.addView(appCompatTextView3);
                        linearLayout2.addView(oneMeButton);
                        return linearLayout2;
                }
            }
        });
        final int i2 = 1;
        this.o = binding(new k56(this) { // from class: m48
            public final /* synthetic */ MediaBarPermissionWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                int i22 = 17;
                int i3 = 0;
                int i4 = 16;
                Continuation continuation = null;
                int i5 = 1;
                MediaBarPermissionWidget mediaBarPermissionWidget = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = MediaBarPermissionWidget.Z;
                        LinearLayout linearLayout = new LinearLayout(mediaBarPermissionWidget.getContext());
                        linearLayout.setOrientation(1);
                        linearLayout.setVerticalGravity(16);
                        linearLayout.setHorizontalGravity(1);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        float f = 4;
                        layoutParams.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(24 * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                        linearLayout.setLayoutParams(layoutParams);
                        Drawable drawableB = kt3.b(linearLayout.getContext(), s8a.e);
                        AppCompatImageView appCompatImageView = new AppCompatImageView(linearLayout.getContext(), null);
                        appCompatImageView.setImageDrawable(drawableB);
                        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext(), null);
                        appCompatTextView.setText(u8a.M);
                        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), tu0.G(10 * fk4.d().getDisplayMetrics().density), appCompatTextView.getPaddingRight(), appCompatTextView.getPaddingBottom());
                        i4f.D.b(appCompatTextView, du4.b);
                        v3c.y(new c3(drawableB, appCompatTextView, continuation, i4), linearLayout);
                        linearLayout.addView(appCompatImageView);
                        linearLayout.addView(appCompatTextView);
                        tu0.K(linearLayout, 300L, new n48(mediaBarPermissionWidget, i3));
                        return linearLayout;
                    case 1:
                        bc7[] bc7VarArr2 = MediaBarPermissionWidget.Z;
                        CameraxCameraApiView cameraxCameraApiView = new CameraxCameraApiView(mediaBarPermissionWidget.getContext(), null, 14);
                        cameraxCameraApiView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        cameraxCameraApiView.e();
                        return cameraxCameraApiView;
                    case 2:
                        bc7[] bc7VarArr3 = MediaBarPermissionWidget.Z;
                        FrameLayout frameLayout = new FrameLayout(mediaBarPermissionWidget.getContext());
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, tu0.G(138 * fk4.d().getDisplayMetrics().density));
                        float f2 = 12;
                        layoutParams2.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(4 * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(8 * fk4.d().getDisplayMetrics().density));
                        frameLayout.setLayoutParams(layoutParams2);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(fk4.d().getDisplayMetrics().density * 12.0f);
                        frameLayout.setBackground(gradientDrawable);
                        frameLayout.setClipToOutline(true);
                        v3c.y(new o48(gradientDrawable, continuation, i3), frameLayout);
                        i24.s(new zn5(((l48) mediaBarPermissionWidget.b.getValue()).c, new p48(mediaBarPermissionWidget, frameLayout, null), 5), mediaBarPermissionWidget.getViewLifecycleScope());
                        return frameLayout;
                    default:
                        bc7[] bc7VarArr4 = MediaBarPermissionWidget.Z;
                        LinearLayout linearLayout2 = new LinearLayout(mediaBarPermissionWidget.getContext());
                        linearLayout2.setOrientation(1);
                        linearLayout2.setVerticalGravity(16);
                        linearLayout2.setHorizontalGravity(1);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, tu0.G(166 * fk4.d().getDisplayMetrics().density));
                        float f3 = 20;
                        float f4 = 0;
                        layoutParams3.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(f3 * fk4.d().getDisplayMetrics().density), tu0.G(f4 * fk4.d().getDisplayMetrics().density));
                        linearLayout2.setLayoutParams(layoutParams3);
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout2.getContext(), null);
                        appCompatTextView2.setText(u8a.S);
                        i4f.o.b(appCompatTextView2, du4.b);
                        appCompatTextView2.setGravity(17);
                        AppCompatTextView appCompatTextView3 = new AppCompatTextView(linearLayout2.getContext(), null);
                        appCompatTextView3.setText(u8a.R);
                        i4f.s.b(appCompatTextView3, du4.b);
                        appCompatTextView3.setPadding(appCompatTextView3.getPaddingLeft(), tu0.G(4 * fk4.d().getDisplayMetrics().density), appCompatTextView3.getPaddingRight(), tu0.G(16 * fk4.d().getDisplayMetrics().density));
                        appCompatTextView3.setGravity(17);
                        OneMeButton oneMeButton = new OneMeButton(linearLayout2.getContext(), null);
                        oneMeButton.setText(u8a.L);
                        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        tu0.K(oneMeButton, 300L, new n48(mediaBarPermissionWidget, i5));
                        v3c.y(new c3(appCompatTextView2, appCompatTextView3, continuation, i22), linearLayout2);
                        linearLayout2.addView(appCompatTextView2);
                        linearLayout2.addView(appCompatTextView3);
                        linearLayout2.addView(oneMeButton);
                        return linearLayout2;
                }
            }
        });
        final int i3 = 2;
        this.X = binding(new k56(this) { // from class: m48
            public final /* synthetic */ MediaBarPermissionWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                int i22 = 17;
                int i32 = 0;
                int i4 = 16;
                Continuation continuation = null;
                int i5 = 1;
                MediaBarPermissionWidget mediaBarPermissionWidget = this.b;
                switch (i3) {
                    case 0:
                        bc7[] bc7VarArr = MediaBarPermissionWidget.Z;
                        LinearLayout linearLayout = new LinearLayout(mediaBarPermissionWidget.getContext());
                        linearLayout.setOrientation(1);
                        linearLayout.setVerticalGravity(16);
                        linearLayout.setHorizontalGravity(1);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        float f = 4;
                        layoutParams.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(24 * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                        linearLayout.setLayoutParams(layoutParams);
                        Drawable drawableB = kt3.b(linearLayout.getContext(), s8a.e);
                        AppCompatImageView appCompatImageView = new AppCompatImageView(linearLayout.getContext(), null);
                        appCompatImageView.setImageDrawable(drawableB);
                        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext(), null);
                        appCompatTextView.setText(u8a.M);
                        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), tu0.G(10 * fk4.d().getDisplayMetrics().density), appCompatTextView.getPaddingRight(), appCompatTextView.getPaddingBottom());
                        i4f.D.b(appCompatTextView, du4.b);
                        v3c.y(new c3(drawableB, appCompatTextView, continuation, i4), linearLayout);
                        linearLayout.addView(appCompatImageView);
                        linearLayout.addView(appCompatTextView);
                        tu0.K(linearLayout, 300L, new n48(mediaBarPermissionWidget, i32));
                        return linearLayout;
                    case 1:
                        bc7[] bc7VarArr2 = MediaBarPermissionWidget.Z;
                        CameraxCameraApiView cameraxCameraApiView = new CameraxCameraApiView(mediaBarPermissionWidget.getContext(), null, 14);
                        cameraxCameraApiView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        cameraxCameraApiView.e();
                        return cameraxCameraApiView;
                    case 2:
                        bc7[] bc7VarArr3 = MediaBarPermissionWidget.Z;
                        FrameLayout frameLayout = new FrameLayout(mediaBarPermissionWidget.getContext());
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, tu0.G(138 * fk4.d().getDisplayMetrics().density));
                        float f2 = 12;
                        layoutParams2.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(4 * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(8 * fk4.d().getDisplayMetrics().density));
                        frameLayout.setLayoutParams(layoutParams2);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(fk4.d().getDisplayMetrics().density * 12.0f);
                        frameLayout.setBackground(gradientDrawable);
                        frameLayout.setClipToOutline(true);
                        v3c.y(new o48(gradientDrawable, continuation, i32), frameLayout);
                        i24.s(new zn5(((l48) mediaBarPermissionWidget.b.getValue()).c, new p48(mediaBarPermissionWidget, frameLayout, null), 5), mediaBarPermissionWidget.getViewLifecycleScope());
                        return frameLayout;
                    default:
                        bc7[] bc7VarArr4 = MediaBarPermissionWidget.Z;
                        LinearLayout linearLayout2 = new LinearLayout(mediaBarPermissionWidget.getContext());
                        linearLayout2.setOrientation(1);
                        linearLayout2.setVerticalGravity(16);
                        linearLayout2.setHorizontalGravity(1);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, tu0.G(166 * fk4.d().getDisplayMetrics().density));
                        float f3 = 20;
                        float f4 = 0;
                        layoutParams3.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(f3 * fk4.d().getDisplayMetrics().density), tu0.G(f4 * fk4.d().getDisplayMetrics().density));
                        linearLayout2.setLayoutParams(layoutParams3);
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout2.getContext(), null);
                        appCompatTextView2.setText(u8a.S);
                        i4f.o.b(appCompatTextView2, du4.b);
                        appCompatTextView2.setGravity(17);
                        AppCompatTextView appCompatTextView3 = new AppCompatTextView(linearLayout2.getContext(), null);
                        appCompatTextView3.setText(u8a.R);
                        i4f.s.b(appCompatTextView3, du4.b);
                        appCompatTextView3.setPadding(appCompatTextView3.getPaddingLeft(), tu0.G(4 * fk4.d().getDisplayMetrics().density), appCompatTextView3.getPaddingRight(), tu0.G(16 * fk4.d().getDisplayMetrics().density));
                        appCompatTextView3.setGravity(17);
                        OneMeButton oneMeButton = new OneMeButton(linearLayout2.getContext(), null);
                        oneMeButton.setText(u8a.L);
                        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        tu0.K(oneMeButton, 300L, new n48(mediaBarPermissionWidget, i5));
                        v3c.y(new c3(appCompatTextView2, appCompatTextView3, continuation, i22), linearLayout2);
                        linearLayout2.addView(appCompatTextView2);
                        linearLayout2.addView(appCompatTextView3);
                        linearLayout2.addView(oneMeButton);
                        return linearLayout2;
                }
            }
        });
        final int i4 = 3;
        this.Y = binding(new k56(this) { // from class: m48
            public final /* synthetic */ MediaBarPermissionWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                int i22 = 17;
                int i32 = 0;
                int i42 = 16;
                Continuation continuation = null;
                int i5 = 1;
                MediaBarPermissionWidget mediaBarPermissionWidget = this.b;
                switch (i4) {
                    case 0:
                        bc7[] bc7VarArr = MediaBarPermissionWidget.Z;
                        LinearLayout linearLayout = new LinearLayout(mediaBarPermissionWidget.getContext());
                        linearLayout.setOrientation(1);
                        linearLayout.setVerticalGravity(16);
                        linearLayout.setHorizontalGravity(1);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        float f = 4;
                        layoutParams.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(24 * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                        linearLayout.setLayoutParams(layoutParams);
                        Drawable drawableB = kt3.b(linearLayout.getContext(), s8a.e);
                        AppCompatImageView appCompatImageView = new AppCompatImageView(linearLayout.getContext(), null);
                        appCompatImageView.setImageDrawable(drawableB);
                        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext(), null);
                        appCompatTextView.setText(u8a.M);
                        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), tu0.G(10 * fk4.d().getDisplayMetrics().density), appCompatTextView.getPaddingRight(), appCompatTextView.getPaddingBottom());
                        i4f.D.b(appCompatTextView, du4.b);
                        v3c.y(new c3(drawableB, appCompatTextView, continuation, i42), linearLayout);
                        linearLayout.addView(appCompatImageView);
                        linearLayout.addView(appCompatTextView);
                        tu0.K(linearLayout, 300L, new n48(mediaBarPermissionWidget, i32));
                        return linearLayout;
                    case 1:
                        bc7[] bc7VarArr2 = MediaBarPermissionWidget.Z;
                        CameraxCameraApiView cameraxCameraApiView = new CameraxCameraApiView(mediaBarPermissionWidget.getContext(), null, 14);
                        cameraxCameraApiView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        cameraxCameraApiView.e();
                        return cameraxCameraApiView;
                    case 2:
                        bc7[] bc7VarArr3 = MediaBarPermissionWidget.Z;
                        FrameLayout frameLayout = new FrameLayout(mediaBarPermissionWidget.getContext());
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, tu0.G(138 * fk4.d().getDisplayMetrics().density));
                        float f2 = 12;
                        layoutParams2.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(4 * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(8 * fk4.d().getDisplayMetrics().density));
                        frameLayout.setLayoutParams(layoutParams2);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(fk4.d().getDisplayMetrics().density * 12.0f);
                        frameLayout.setBackground(gradientDrawable);
                        frameLayout.setClipToOutline(true);
                        v3c.y(new o48(gradientDrawable, continuation, i32), frameLayout);
                        i24.s(new zn5(((l48) mediaBarPermissionWidget.b.getValue()).c, new p48(mediaBarPermissionWidget, frameLayout, null), 5), mediaBarPermissionWidget.getViewLifecycleScope());
                        return frameLayout;
                    default:
                        bc7[] bc7VarArr4 = MediaBarPermissionWidget.Z;
                        LinearLayout linearLayout2 = new LinearLayout(mediaBarPermissionWidget.getContext());
                        linearLayout2.setOrientation(1);
                        linearLayout2.setVerticalGravity(16);
                        linearLayout2.setHorizontalGravity(1);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, tu0.G(166 * fk4.d().getDisplayMetrics().density));
                        float f3 = 20;
                        float f4 = 0;
                        layoutParams3.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(f3 * fk4.d().getDisplayMetrics().density), tu0.G(f4 * fk4.d().getDisplayMetrics().density));
                        linearLayout2.setLayoutParams(layoutParams3);
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout2.getContext(), null);
                        appCompatTextView2.setText(u8a.S);
                        i4f.o.b(appCompatTextView2, du4.b);
                        appCompatTextView2.setGravity(17);
                        AppCompatTextView appCompatTextView3 = new AppCompatTextView(linearLayout2.getContext(), null);
                        appCompatTextView3.setText(u8a.R);
                        i4f.s.b(appCompatTextView3, du4.b);
                        appCompatTextView3.setPadding(appCompatTextView3.getPaddingLeft(), tu0.G(4 * fk4.d().getDisplayMetrics().density), appCompatTextView3.getPaddingRight(), tu0.G(16 * fk4.d().getDisplayMetrics().density));
                        appCompatTextView3.setGravity(17);
                        OneMeButton oneMeButton = new OneMeButton(linearLayout2.getContext(), null);
                        oneMeButton.setText(u8a.L);
                        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        tu0.K(oneMeButton, 300L, new n48(mediaBarPermissionWidget, i5));
                        v3c.y(new c3(appCompatTextView2, appCompatTextView3, continuation, i22), linearLayout2);
                        linearLayout2.addView(appCompatTextView2);
                        linearLayout2.addView(appCompatTextView3);
                        linearLayout2.addView(oneMeButton);
                        return linearLayout2;
                }
            }
        });
    }

    public final void m0() {
        je7 je7Var = this.a;
        if (((eua) je7Var.getValue()).b(eua.l)) {
            ((eua) je7Var.getValue()).f(new l5g(this, 1), eua.m, 157);
        } else {
            ((eua) je7Var.getValue()).f(new l5g(this, 1), eua.n, 162);
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final void onActivityResumed(Activity activity) {
        ((l48) this.b.getValue()).b.h();
        super.onActivityResumed(activity);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        bc7[] bc7VarArr = Z;
        bc7 bc7Var = bc7VarArr[1];
        linearLayout.addView((FrameLayout) this.X.getValue());
        bc7 bc7Var2 = bc7VarArr[2];
        linearLayout.addView((LinearLayout) this.Y.getValue());
        return linearLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        qm0 qm0Var = this.o;
        if (qm0Var.a()) {
            ((hv1) qm0Var.getValue()).c();
        }
        super.onDestroyView(view);
    }

    @Override // defpackage.uu3
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        je7 je7Var = this.a;
        int i2 = 0;
        if (i != 157) {
            if (i != 162) {
                return;
            }
            int length = iArr.length;
            while (i2 < length) {
                if (iArr[i2] != -1) {
                    return;
                } else {
                    i2++;
                }
            }
            eua.l((eua) je7Var.getValue(), new l5g(this, 1), strArr, iArr, eua.n, u8a.O, u8a.N);
            return;
        }
        int length2 = iArr.length;
        while (i2 < length2) {
            if (iArr[i2] != -1) {
                return;
            } else {
                i2++;
            }
        }
        eua euaVar = (eua) je7Var.getValue();
        l5g l5gVar = new l5g(this, 1);
        int i3 = u8a.Q;
        int i4 = u8a.P;
        euaVar.getClass();
        eua.j(l5gVar, strArr, iArr, i3, i4);
    }

    public MediaBarPermissionWidget() {
        this(new Bundle(0));
    }
}

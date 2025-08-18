package ru.ok.messages.views;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import defpackage.a2c;
import defpackage.an9;
import defpackage.b7a;
import defpackage.c7a;
import defpackage.e2b;
import defpackage.ed3;
import defpackage.gd0;
import defpackage.gtb;
import defpackage.ma6;
import defpackage.n5;
import defpackage.pq9;
import defpackage.q5;
import defpackage.qp4;
import defpackage.s36;
import defpackage.spa;
import defpackage.ssc;
import defpackage.wuc;
import defpackage.xxb;
import defpackage.y8a;
import defpackage.yyb;
import defpackage.z6a;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.messages.views.ActAvatarCrop;
import ru.ok.messages.views.widgets.AvatarCropView;

/* loaded from: classes2.dex */
public class ActAvatarCrop extends q5 implements gd0 {
    public static final /* synthetic */ int d1 = 0;
    public AvatarCropView U0;
    public ImageView V0;
    public ImageView W0;
    public ImageView X0;
    public OneMeButton Y0;
    public ImageView Z0;
    public Point a1;
    public final Matrix b1 = new Matrix();
    public boolean c1 = false;

    @Override // defpackage.q5
    public final String Z() {
        return "AVATAR_CROP";
    }

    @Override // defpackage.q5
    public final void d0() {
    }

    @Override // defpackage.q5, androidx.fragment.app.b, defpackage.yb3, android.app.Activity
    public final void onCreate(Bundle bundle) {
        final int i = 1;
        final int i2 = 0;
        super.onCreate(bundle);
        Window window = getWindow();
        pq9 pq9Var = qp4.u0;
        if (window != null) {
            window.getDecorView().setSystemUiVisibility(1280);
            window.clearFlags(67108864);
            window.setStatusBarColor(getColor(gtb.transparent));
            window.setNavigationBarColor(pq9Var.b(this).i().b().a.j);
        }
        setContentView(yyb.act_avatar_crop);
        Uri uri = (Uri) getIntent().getParcelableExtra("ru.ok.tamtam.extra.URI");
        findViewById(xxb.bottom_background).setBackgroundColor(pq9Var.b(this).i().b().a.j);
        pq9Var.b(this).i().getIcon();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(-1);
        ImageView imageView = (ImageView) findViewById(xxb.rotate);
        this.V0 = imageView;
        imageView.setImageTintList(colorStateListValueOf);
        this.V0.setOnClickListener(new View.OnClickListener(this) { // from class: k5
            public final /* synthetic */ ActAvatarCrop b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final int i3 = 1;
                final ActAvatarCrop actAvatarCrop = this.b;
                final int i4 = 0;
                switch (i2) {
                    case 0:
                        oz3 oz3Var = (oz3) actAvatarCrop.U0.getZoomableController();
                        if (!oz3Var.d) {
                            float f = oz3Var.p;
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(90.0f);
                            valueAnimatorOfFloat.setDuration(250L);
                            valueAnimatorOfFloat.addUpdateListener(new pmc(oz3Var, f, 2));
                            valueAnimatorOfFloat.addListener(oz3Var);
                            valueAnimatorOfFloat.start();
                            actAvatarCrop.c1 = !actAvatarCrop.c1;
                            Matrix matrix = actAvatarCrop.b1;
                            Point point = actAvatarCrop.a1;
                            matrix.postRotate(90.0f, point.x / 2.0f, point.y / 2.0f);
                            break;
                        }
                        break;
                    case 1:
                        oz3 oz3Var2 = (oz3) actAvatarCrop.U0.getZoomableController();
                        if (!oz3Var2.d) {
                            float fL = f46.L(oz3Var2.k, 0);
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fL, -fL);
                            valueAnimatorOfFloat2.setDuration(250L);
                            valueAnimatorOfFloat2.addUpdateListener(new z00(6, oz3Var2));
                            valueAnimatorOfFloat2.addListener(oz3Var2);
                            valueAnimatorOfFloat2.start();
                            Matrix matrix2 = actAvatarCrop.b1;
                            Point point2 = actAvatarCrop.a1;
                            matrix2.postScale(-1.0f, 1.0f, point2.x / 2.0f, point2.y / 2.0f);
                            break;
                        }
                        break;
                    case 2:
                        int i5 = ActAvatarCrop.d1;
                        actAvatarCrop.finish();
                        break;
                    case 3:
                        actAvatarCrop.c1 = false;
                        AvatarCropView avatarCropView = actAvatarCrop.U0;
                        oz3 oz3Var3 = (oz3) avatarCropView.getZoomableController();
                        oz3Var3.reset();
                        oz3Var3.e();
                        if (avatarCropView.O0 > 0 && avatarCropView.P0 == 0) {
                            ((oz3) avatarCropView.getZoomableController()).d(avatarCropView.O0);
                        }
                        avatarCropView.f(oz3Var3.k);
                        actAvatarCrop.b1.reset();
                        actAvatarCrop.Y0.setVisibility(8);
                        break;
                    default:
                        int i6 = ActAvatarCrop.d1;
                        ((y8a) ((ed3) actAvatarCrop.K0.b)).getClass();
                        jyc jycVar = jyc.a;
                        q1a q1aVar = new q1a(2, new l5(0, actAvatarCrop));
                        hle hleVarT = jycVar.t();
                        hleVarT.getClass();
                        q1aVar.m(((jle) hleVarT).a()).i(((jle) jycVar.t()).b()).k(new iq1(new qj3() { // from class: m5
                            @Override // defpackage.qj3
                            public final void accept(Object obj) {
                                ActAvatarCrop actAvatarCrop2 = actAvatarCrop;
                                switch (i4) {
                                    case 0:
                                        Rect rect = (Rect) obj;
                                        int i7 = ActAvatarCrop.d1;
                                        actAvatarCrop2.getClass();
                                        Intent intent = new Intent();
                                        intent.putExtra("ru.ok.tamtam.extra.CROPPED_ABSOLUTE", rect);
                                        Point point3 = actAvatarCrop2.a1;
                                        float f2 = rect.left;
                                        float f3 = point3.x;
                                        float f4 = rect.top;
                                        float f5 = point3.y;
                                        intent.putExtra("ru.ok.tamtam.extra.CROPPED_RECT", new RectF(f2 / f3, f4 / f5, rect.right / f3, rect.bottom / f5));
                                        intent.putExtra("ru.ok.tamtam.extra.URI", (Uri) actAvatarCrop2.getIntent().getParcelableExtra("ru.ok.tamtam.extra.URI"));
                                        intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", actAvatarCrop2.getIntent().getStringExtra("ru.ok.tamtam.extra.FILE_PATH"));
                                        actAvatarCrop2.setResult(-1, intent);
                                        actAvatarCrop2.finish();
                                        if (actAvatarCrop2.getIntent().getBooleanExtra("ru.ok.tamtam.extra.NO_ANIM ", false)) {
                                            actAvatarCrop2.overridePendingTransition(0, 0);
                                            break;
                                        }
                                        break;
                                    default:
                                        int i8 = ActAvatarCrop.d1;
                                        actAvatarCrop2.getClass();
                                        hm9.k("ru.ok.messages.views.ActAvatarCrop", "Error occurred during applying image transformation. Error: " + ((Throwable) obj).toString());
                                        actAvatarCrop2.setResult(0);
                                        int i9 = jpc.E;
                                        Handler handler = a14.i;
                                        a14.N(1, actAvatarCrop2, actAvatarCrop2.getString(i9));
                                        actAvatarCrop2.finish();
                                        break;
                                }
                            }
                        }, 2, new qj3() { // from class: m5
                            @Override // defpackage.qj3
                            public final void accept(Object obj) {
                                ActAvatarCrop actAvatarCrop2 = actAvatarCrop;
                                switch (i3) {
                                    case 0:
                                        Rect rect = (Rect) obj;
                                        int i7 = ActAvatarCrop.d1;
                                        actAvatarCrop2.getClass();
                                        Intent intent = new Intent();
                                        intent.putExtra("ru.ok.tamtam.extra.CROPPED_ABSOLUTE", rect);
                                        Point point3 = actAvatarCrop2.a1;
                                        float f2 = rect.left;
                                        float f3 = point3.x;
                                        float f4 = rect.top;
                                        float f5 = point3.y;
                                        intent.putExtra("ru.ok.tamtam.extra.CROPPED_RECT", new RectF(f2 / f3, f4 / f5, rect.right / f3, rect.bottom / f5));
                                        intent.putExtra("ru.ok.tamtam.extra.URI", (Uri) actAvatarCrop2.getIntent().getParcelableExtra("ru.ok.tamtam.extra.URI"));
                                        intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", actAvatarCrop2.getIntent().getStringExtra("ru.ok.tamtam.extra.FILE_PATH"));
                                        actAvatarCrop2.setResult(-1, intent);
                                        actAvatarCrop2.finish();
                                        if (actAvatarCrop2.getIntent().getBooleanExtra("ru.ok.tamtam.extra.NO_ANIM ", false)) {
                                            actAvatarCrop2.overridePendingTransition(0, 0);
                                            break;
                                        }
                                        break;
                                    default:
                                        int i8 = ActAvatarCrop.d1;
                                        actAvatarCrop2.getClass();
                                        hm9.k("ru.ok.messages.views.ActAvatarCrop", "Error occurred during applying image transformation. Error: " + ((Throwable) obj).toString());
                                        actAvatarCrop2.setResult(0);
                                        int i9 = jpc.E;
                                        Handler handler = a14.i;
                                        a14.N(1, actAvatarCrop2, actAvatarCrop2.getString(i9));
                                        actAvatarCrop2.finish();
                                        break;
                                }
                            }
                        }));
                        break;
                }
            }
        });
        ImageView imageView2 = (ImageView) findViewById(xxb.flip_horizontally);
        this.W0 = imageView2;
        imageView2.setImageTintList(colorStateListValueOf);
        this.W0.setOnClickListener(new View.OnClickListener(this) { // from class: k5
            public final /* synthetic */ ActAvatarCrop b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final int i3 = 1;
                final ActAvatarCrop actAvatarCrop = this.b;
                final int i4 = 0;
                switch (i) {
                    case 0:
                        oz3 oz3Var = (oz3) actAvatarCrop.U0.getZoomableController();
                        if (!oz3Var.d) {
                            float f = oz3Var.p;
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(90.0f);
                            valueAnimatorOfFloat.setDuration(250L);
                            valueAnimatorOfFloat.addUpdateListener(new pmc(oz3Var, f, 2));
                            valueAnimatorOfFloat.addListener(oz3Var);
                            valueAnimatorOfFloat.start();
                            actAvatarCrop.c1 = !actAvatarCrop.c1;
                            Matrix matrix = actAvatarCrop.b1;
                            Point point = actAvatarCrop.a1;
                            matrix.postRotate(90.0f, point.x / 2.0f, point.y / 2.0f);
                            break;
                        }
                        break;
                    case 1:
                        oz3 oz3Var2 = (oz3) actAvatarCrop.U0.getZoomableController();
                        if (!oz3Var2.d) {
                            float fL = f46.L(oz3Var2.k, 0);
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fL, -fL);
                            valueAnimatorOfFloat2.setDuration(250L);
                            valueAnimatorOfFloat2.addUpdateListener(new z00(6, oz3Var2));
                            valueAnimatorOfFloat2.addListener(oz3Var2);
                            valueAnimatorOfFloat2.start();
                            Matrix matrix2 = actAvatarCrop.b1;
                            Point point2 = actAvatarCrop.a1;
                            matrix2.postScale(-1.0f, 1.0f, point2.x / 2.0f, point2.y / 2.0f);
                            break;
                        }
                        break;
                    case 2:
                        int i5 = ActAvatarCrop.d1;
                        actAvatarCrop.finish();
                        break;
                    case 3:
                        actAvatarCrop.c1 = false;
                        AvatarCropView avatarCropView = actAvatarCrop.U0;
                        oz3 oz3Var3 = (oz3) avatarCropView.getZoomableController();
                        oz3Var3.reset();
                        oz3Var3.e();
                        if (avatarCropView.O0 > 0 && avatarCropView.P0 == 0) {
                            ((oz3) avatarCropView.getZoomableController()).d(avatarCropView.O0);
                        }
                        avatarCropView.f(oz3Var3.k);
                        actAvatarCrop.b1.reset();
                        actAvatarCrop.Y0.setVisibility(8);
                        break;
                    default:
                        int i6 = ActAvatarCrop.d1;
                        ((y8a) ((ed3) actAvatarCrop.K0.b)).getClass();
                        jyc jycVar = jyc.a;
                        q1a q1aVar = new q1a(2, new l5(0, actAvatarCrop));
                        hle hleVarT = jycVar.t();
                        hleVarT.getClass();
                        q1aVar.m(((jle) hleVarT).a()).i(((jle) jycVar.t()).b()).k(new iq1(new qj3() { // from class: m5
                            @Override // defpackage.qj3
                            public final void accept(Object obj) {
                                ActAvatarCrop actAvatarCrop2 = actAvatarCrop;
                                switch (i4) {
                                    case 0:
                                        Rect rect = (Rect) obj;
                                        int i7 = ActAvatarCrop.d1;
                                        actAvatarCrop2.getClass();
                                        Intent intent = new Intent();
                                        intent.putExtra("ru.ok.tamtam.extra.CROPPED_ABSOLUTE", rect);
                                        Point point3 = actAvatarCrop2.a1;
                                        float f2 = rect.left;
                                        float f3 = point3.x;
                                        float f4 = rect.top;
                                        float f5 = point3.y;
                                        intent.putExtra("ru.ok.tamtam.extra.CROPPED_RECT", new RectF(f2 / f3, f4 / f5, rect.right / f3, rect.bottom / f5));
                                        intent.putExtra("ru.ok.tamtam.extra.URI", (Uri) actAvatarCrop2.getIntent().getParcelableExtra("ru.ok.tamtam.extra.URI"));
                                        intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", actAvatarCrop2.getIntent().getStringExtra("ru.ok.tamtam.extra.FILE_PATH"));
                                        actAvatarCrop2.setResult(-1, intent);
                                        actAvatarCrop2.finish();
                                        if (actAvatarCrop2.getIntent().getBooleanExtra("ru.ok.tamtam.extra.NO_ANIM ", false)) {
                                            actAvatarCrop2.overridePendingTransition(0, 0);
                                            break;
                                        }
                                        break;
                                    default:
                                        int i8 = ActAvatarCrop.d1;
                                        actAvatarCrop2.getClass();
                                        hm9.k("ru.ok.messages.views.ActAvatarCrop", "Error occurred during applying image transformation. Error: " + ((Throwable) obj).toString());
                                        actAvatarCrop2.setResult(0);
                                        int i9 = jpc.E;
                                        Handler handler = a14.i;
                                        a14.N(1, actAvatarCrop2, actAvatarCrop2.getString(i9));
                                        actAvatarCrop2.finish();
                                        break;
                                }
                            }
                        }, 2, new qj3() { // from class: m5
                            @Override // defpackage.qj3
                            public final void accept(Object obj) {
                                ActAvatarCrop actAvatarCrop2 = actAvatarCrop;
                                switch (i3) {
                                    case 0:
                                        Rect rect = (Rect) obj;
                                        int i7 = ActAvatarCrop.d1;
                                        actAvatarCrop2.getClass();
                                        Intent intent = new Intent();
                                        intent.putExtra("ru.ok.tamtam.extra.CROPPED_ABSOLUTE", rect);
                                        Point point3 = actAvatarCrop2.a1;
                                        float f2 = rect.left;
                                        float f3 = point3.x;
                                        float f4 = rect.top;
                                        float f5 = point3.y;
                                        intent.putExtra("ru.ok.tamtam.extra.CROPPED_RECT", new RectF(f2 / f3, f4 / f5, rect.right / f3, rect.bottom / f5));
                                        intent.putExtra("ru.ok.tamtam.extra.URI", (Uri) actAvatarCrop2.getIntent().getParcelableExtra("ru.ok.tamtam.extra.URI"));
                                        intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", actAvatarCrop2.getIntent().getStringExtra("ru.ok.tamtam.extra.FILE_PATH"));
                                        actAvatarCrop2.setResult(-1, intent);
                                        actAvatarCrop2.finish();
                                        if (actAvatarCrop2.getIntent().getBooleanExtra("ru.ok.tamtam.extra.NO_ANIM ", false)) {
                                            actAvatarCrop2.overridePendingTransition(0, 0);
                                            break;
                                        }
                                        break;
                                    default:
                                        int i8 = ActAvatarCrop.d1;
                                        actAvatarCrop2.getClass();
                                        hm9.k("ru.ok.messages.views.ActAvatarCrop", "Error occurred during applying image transformation. Error: " + ((Throwable) obj).toString());
                                        actAvatarCrop2.setResult(0);
                                        int i9 = jpc.E;
                                        Handler handler = a14.i;
                                        a14.N(1, actAvatarCrop2, actAvatarCrop2.getString(i9));
                                        actAvatarCrop2.finish();
                                        break;
                                }
                            }
                        }));
                        break;
                }
            }
        });
        ImageView imageView3 = (ImageView) findViewById(xxb.close);
        this.X0 = imageView3;
        imageView3.setImageTintList(colorStateListValueOf);
        final int i3 = 2;
        this.X0.setOnClickListener(new View.OnClickListener(this) { // from class: k5
            public final /* synthetic */ ActAvatarCrop b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final int i32 = 1;
                final ActAvatarCrop actAvatarCrop = this.b;
                final int i4 = 0;
                switch (i3) {
                    case 0:
                        oz3 oz3Var = (oz3) actAvatarCrop.U0.getZoomableController();
                        if (!oz3Var.d) {
                            float f = oz3Var.p;
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(90.0f);
                            valueAnimatorOfFloat.setDuration(250L);
                            valueAnimatorOfFloat.addUpdateListener(new pmc(oz3Var, f, 2));
                            valueAnimatorOfFloat.addListener(oz3Var);
                            valueAnimatorOfFloat.start();
                            actAvatarCrop.c1 = !actAvatarCrop.c1;
                            Matrix matrix = actAvatarCrop.b1;
                            Point point = actAvatarCrop.a1;
                            matrix.postRotate(90.0f, point.x / 2.0f, point.y / 2.0f);
                            break;
                        }
                        break;
                    case 1:
                        oz3 oz3Var2 = (oz3) actAvatarCrop.U0.getZoomableController();
                        if (!oz3Var2.d) {
                            float fL = f46.L(oz3Var2.k, 0);
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fL, -fL);
                            valueAnimatorOfFloat2.setDuration(250L);
                            valueAnimatorOfFloat2.addUpdateListener(new z00(6, oz3Var2));
                            valueAnimatorOfFloat2.addListener(oz3Var2);
                            valueAnimatorOfFloat2.start();
                            Matrix matrix2 = actAvatarCrop.b1;
                            Point point2 = actAvatarCrop.a1;
                            matrix2.postScale(-1.0f, 1.0f, point2.x / 2.0f, point2.y / 2.0f);
                            break;
                        }
                        break;
                    case 2:
                        int i5 = ActAvatarCrop.d1;
                        actAvatarCrop.finish();
                        break;
                    case 3:
                        actAvatarCrop.c1 = false;
                        AvatarCropView avatarCropView = actAvatarCrop.U0;
                        oz3 oz3Var3 = (oz3) avatarCropView.getZoomableController();
                        oz3Var3.reset();
                        oz3Var3.e();
                        if (avatarCropView.O0 > 0 && avatarCropView.P0 == 0) {
                            ((oz3) avatarCropView.getZoomableController()).d(avatarCropView.O0);
                        }
                        avatarCropView.f(oz3Var3.k);
                        actAvatarCrop.b1.reset();
                        actAvatarCrop.Y0.setVisibility(8);
                        break;
                    default:
                        int i6 = ActAvatarCrop.d1;
                        ((y8a) ((ed3) actAvatarCrop.K0.b)).getClass();
                        jyc jycVar = jyc.a;
                        q1a q1aVar = new q1a(2, new l5(0, actAvatarCrop));
                        hle hleVarT = jycVar.t();
                        hleVarT.getClass();
                        q1aVar.m(((jle) hleVarT).a()).i(((jle) jycVar.t()).b()).k(new iq1(new qj3() { // from class: m5
                            @Override // defpackage.qj3
                            public final void accept(Object obj) {
                                ActAvatarCrop actAvatarCrop2 = actAvatarCrop;
                                switch (i4) {
                                    case 0:
                                        Rect rect = (Rect) obj;
                                        int i7 = ActAvatarCrop.d1;
                                        actAvatarCrop2.getClass();
                                        Intent intent = new Intent();
                                        intent.putExtra("ru.ok.tamtam.extra.CROPPED_ABSOLUTE", rect);
                                        Point point3 = actAvatarCrop2.a1;
                                        float f2 = rect.left;
                                        float f3 = point3.x;
                                        float f4 = rect.top;
                                        float f5 = point3.y;
                                        intent.putExtra("ru.ok.tamtam.extra.CROPPED_RECT", new RectF(f2 / f3, f4 / f5, rect.right / f3, rect.bottom / f5));
                                        intent.putExtra("ru.ok.tamtam.extra.URI", (Uri) actAvatarCrop2.getIntent().getParcelableExtra("ru.ok.tamtam.extra.URI"));
                                        intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", actAvatarCrop2.getIntent().getStringExtra("ru.ok.tamtam.extra.FILE_PATH"));
                                        actAvatarCrop2.setResult(-1, intent);
                                        actAvatarCrop2.finish();
                                        if (actAvatarCrop2.getIntent().getBooleanExtra("ru.ok.tamtam.extra.NO_ANIM ", false)) {
                                            actAvatarCrop2.overridePendingTransition(0, 0);
                                            break;
                                        }
                                        break;
                                    default:
                                        int i8 = ActAvatarCrop.d1;
                                        actAvatarCrop2.getClass();
                                        hm9.k("ru.ok.messages.views.ActAvatarCrop", "Error occurred during applying image transformation. Error: " + ((Throwable) obj).toString());
                                        actAvatarCrop2.setResult(0);
                                        int i9 = jpc.E;
                                        Handler handler = a14.i;
                                        a14.N(1, actAvatarCrop2, actAvatarCrop2.getString(i9));
                                        actAvatarCrop2.finish();
                                        break;
                                }
                            }
                        }, 2, new qj3() { // from class: m5
                            @Override // defpackage.qj3
                            public final void accept(Object obj) {
                                ActAvatarCrop actAvatarCrop2 = actAvatarCrop;
                                switch (i32) {
                                    case 0:
                                        Rect rect = (Rect) obj;
                                        int i7 = ActAvatarCrop.d1;
                                        actAvatarCrop2.getClass();
                                        Intent intent = new Intent();
                                        intent.putExtra("ru.ok.tamtam.extra.CROPPED_ABSOLUTE", rect);
                                        Point point3 = actAvatarCrop2.a1;
                                        float f2 = rect.left;
                                        float f3 = point3.x;
                                        float f4 = rect.top;
                                        float f5 = point3.y;
                                        intent.putExtra("ru.ok.tamtam.extra.CROPPED_RECT", new RectF(f2 / f3, f4 / f5, rect.right / f3, rect.bottom / f5));
                                        intent.putExtra("ru.ok.tamtam.extra.URI", (Uri) actAvatarCrop2.getIntent().getParcelableExtra("ru.ok.tamtam.extra.URI"));
                                        intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", actAvatarCrop2.getIntent().getStringExtra("ru.ok.tamtam.extra.FILE_PATH"));
                                        actAvatarCrop2.setResult(-1, intent);
                                        actAvatarCrop2.finish();
                                        if (actAvatarCrop2.getIntent().getBooleanExtra("ru.ok.tamtam.extra.NO_ANIM ", false)) {
                                            actAvatarCrop2.overridePendingTransition(0, 0);
                                            break;
                                        }
                                        break;
                                    default:
                                        int i8 = ActAvatarCrop.d1;
                                        actAvatarCrop2.getClass();
                                        hm9.k("ru.ok.messages.views.ActAvatarCrop", "Error occurred during applying image transformation. Error: " + ((Throwable) obj).toString());
                                        actAvatarCrop2.setResult(0);
                                        int i9 = jpc.E;
                                        Handler handler = a14.i;
                                        a14.N(1, actAvatarCrop2, actAvatarCrop2.getString(i9));
                                        actAvatarCrop2.finish();
                                        break;
                                }
                            }
                        }));
                        break;
                }
            }
        });
        OneMeButton oneMeButton = (OneMeButton) findViewById(xxb.reset);
        this.Y0 = oneMeButton;
        oneMeButton.setText(a2c.f0oneme_avatar_rop_reset);
        this.Y0.setSize(c7a.a);
        this.Y0.setMode(b7a.o);
        this.Y0.setAppearance(z6a.X);
        final int i4 = 3;
        this.Y0.setOnClickListener(new View.OnClickListener(this) { // from class: k5
            public final /* synthetic */ ActAvatarCrop b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final int i32 = 1;
                final ActAvatarCrop actAvatarCrop = this.b;
                final int i42 = 0;
                switch (i4) {
                    case 0:
                        oz3 oz3Var = (oz3) actAvatarCrop.U0.getZoomableController();
                        if (!oz3Var.d) {
                            float f = oz3Var.p;
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(90.0f);
                            valueAnimatorOfFloat.setDuration(250L);
                            valueAnimatorOfFloat.addUpdateListener(new pmc(oz3Var, f, 2));
                            valueAnimatorOfFloat.addListener(oz3Var);
                            valueAnimatorOfFloat.start();
                            actAvatarCrop.c1 = !actAvatarCrop.c1;
                            Matrix matrix = actAvatarCrop.b1;
                            Point point = actAvatarCrop.a1;
                            matrix.postRotate(90.0f, point.x / 2.0f, point.y / 2.0f);
                            break;
                        }
                        break;
                    case 1:
                        oz3 oz3Var2 = (oz3) actAvatarCrop.U0.getZoomableController();
                        if (!oz3Var2.d) {
                            float fL = f46.L(oz3Var2.k, 0);
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fL, -fL);
                            valueAnimatorOfFloat2.setDuration(250L);
                            valueAnimatorOfFloat2.addUpdateListener(new z00(6, oz3Var2));
                            valueAnimatorOfFloat2.addListener(oz3Var2);
                            valueAnimatorOfFloat2.start();
                            Matrix matrix2 = actAvatarCrop.b1;
                            Point point2 = actAvatarCrop.a1;
                            matrix2.postScale(-1.0f, 1.0f, point2.x / 2.0f, point2.y / 2.0f);
                            break;
                        }
                        break;
                    case 2:
                        int i5 = ActAvatarCrop.d1;
                        actAvatarCrop.finish();
                        break;
                    case 3:
                        actAvatarCrop.c1 = false;
                        AvatarCropView avatarCropView = actAvatarCrop.U0;
                        oz3 oz3Var3 = (oz3) avatarCropView.getZoomableController();
                        oz3Var3.reset();
                        oz3Var3.e();
                        if (avatarCropView.O0 > 0 && avatarCropView.P0 == 0) {
                            ((oz3) avatarCropView.getZoomableController()).d(avatarCropView.O0);
                        }
                        avatarCropView.f(oz3Var3.k);
                        actAvatarCrop.b1.reset();
                        actAvatarCrop.Y0.setVisibility(8);
                        break;
                    default:
                        int i6 = ActAvatarCrop.d1;
                        ((y8a) ((ed3) actAvatarCrop.K0.b)).getClass();
                        jyc jycVar = jyc.a;
                        q1a q1aVar = new q1a(2, new l5(0, actAvatarCrop));
                        hle hleVarT = jycVar.t();
                        hleVarT.getClass();
                        q1aVar.m(((jle) hleVarT).a()).i(((jle) jycVar.t()).b()).k(new iq1(new qj3() { // from class: m5
                            @Override // defpackage.qj3
                            public final void accept(Object obj) {
                                ActAvatarCrop actAvatarCrop2 = actAvatarCrop;
                                switch (i42) {
                                    case 0:
                                        Rect rect = (Rect) obj;
                                        int i7 = ActAvatarCrop.d1;
                                        actAvatarCrop2.getClass();
                                        Intent intent = new Intent();
                                        intent.putExtra("ru.ok.tamtam.extra.CROPPED_ABSOLUTE", rect);
                                        Point point3 = actAvatarCrop2.a1;
                                        float f2 = rect.left;
                                        float f3 = point3.x;
                                        float f4 = rect.top;
                                        float f5 = point3.y;
                                        intent.putExtra("ru.ok.tamtam.extra.CROPPED_RECT", new RectF(f2 / f3, f4 / f5, rect.right / f3, rect.bottom / f5));
                                        intent.putExtra("ru.ok.tamtam.extra.URI", (Uri) actAvatarCrop2.getIntent().getParcelableExtra("ru.ok.tamtam.extra.URI"));
                                        intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", actAvatarCrop2.getIntent().getStringExtra("ru.ok.tamtam.extra.FILE_PATH"));
                                        actAvatarCrop2.setResult(-1, intent);
                                        actAvatarCrop2.finish();
                                        if (actAvatarCrop2.getIntent().getBooleanExtra("ru.ok.tamtam.extra.NO_ANIM ", false)) {
                                            actAvatarCrop2.overridePendingTransition(0, 0);
                                            break;
                                        }
                                        break;
                                    default:
                                        int i8 = ActAvatarCrop.d1;
                                        actAvatarCrop2.getClass();
                                        hm9.k("ru.ok.messages.views.ActAvatarCrop", "Error occurred during applying image transformation. Error: " + ((Throwable) obj).toString());
                                        actAvatarCrop2.setResult(0);
                                        int i9 = jpc.E;
                                        Handler handler = a14.i;
                                        a14.N(1, actAvatarCrop2, actAvatarCrop2.getString(i9));
                                        actAvatarCrop2.finish();
                                        break;
                                }
                            }
                        }, 2, new qj3() { // from class: m5
                            @Override // defpackage.qj3
                            public final void accept(Object obj) {
                                ActAvatarCrop actAvatarCrop2 = actAvatarCrop;
                                switch (i32) {
                                    case 0:
                                        Rect rect = (Rect) obj;
                                        int i7 = ActAvatarCrop.d1;
                                        actAvatarCrop2.getClass();
                                        Intent intent = new Intent();
                                        intent.putExtra("ru.ok.tamtam.extra.CROPPED_ABSOLUTE", rect);
                                        Point point3 = actAvatarCrop2.a1;
                                        float f2 = rect.left;
                                        float f3 = point3.x;
                                        float f4 = rect.top;
                                        float f5 = point3.y;
                                        intent.putExtra("ru.ok.tamtam.extra.CROPPED_RECT", new RectF(f2 / f3, f4 / f5, rect.right / f3, rect.bottom / f5));
                                        intent.putExtra("ru.ok.tamtam.extra.URI", (Uri) actAvatarCrop2.getIntent().getParcelableExtra("ru.ok.tamtam.extra.URI"));
                                        intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", actAvatarCrop2.getIntent().getStringExtra("ru.ok.tamtam.extra.FILE_PATH"));
                                        actAvatarCrop2.setResult(-1, intent);
                                        actAvatarCrop2.finish();
                                        if (actAvatarCrop2.getIntent().getBooleanExtra("ru.ok.tamtam.extra.NO_ANIM ", false)) {
                                            actAvatarCrop2.overridePendingTransition(0, 0);
                                            break;
                                        }
                                        break;
                                    default:
                                        int i8 = ActAvatarCrop.d1;
                                        actAvatarCrop2.getClass();
                                        hm9.k("ru.ok.messages.views.ActAvatarCrop", "Error occurred during applying image transformation. Error: " + ((Throwable) obj).toString());
                                        actAvatarCrop2.setResult(0);
                                        int i9 = jpc.E;
                                        Handler handler = a14.i;
                                        a14.N(1, actAvatarCrop2, actAvatarCrop2.getString(i9));
                                        actAvatarCrop2.finish();
                                        break;
                                }
                            }
                        }));
                        break;
                }
            }
        });
        ImageView imageView4 = (ImageView) findViewById(xxb.done);
        this.Z0 = imageView4;
        imageView4.setImageTintList(colorStateListValueOf);
        final int i5 = 4;
        this.Z0.setOnClickListener(new View.OnClickListener(this) { // from class: k5
            public final /* synthetic */ ActAvatarCrop b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final int i32 = 1;
                final ActAvatarCrop actAvatarCrop = this.b;
                final int i42 = 0;
                switch (i5) {
                    case 0:
                        oz3 oz3Var = (oz3) actAvatarCrop.U0.getZoomableController();
                        if (!oz3Var.d) {
                            float f = oz3Var.p;
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(90.0f);
                            valueAnimatorOfFloat.setDuration(250L);
                            valueAnimatorOfFloat.addUpdateListener(new pmc(oz3Var, f, 2));
                            valueAnimatorOfFloat.addListener(oz3Var);
                            valueAnimatorOfFloat.start();
                            actAvatarCrop.c1 = !actAvatarCrop.c1;
                            Matrix matrix = actAvatarCrop.b1;
                            Point point = actAvatarCrop.a1;
                            matrix.postRotate(90.0f, point.x / 2.0f, point.y / 2.0f);
                            break;
                        }
                        break;
                    case 1:
                        oz3 oz3Var2 = (oz3) actAvatarCrop.U0.getZoomableController();
                        if (!oz3Var2.d) {
                            float fL = f46.L(oz3Var2.k, 0);
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fL, -fL);
                            valueAnimatorOfFloat2.setDuration(250L);
                            valueAnimatorOfFloat2.addUpdateListener(new z00(6, oz3Var2));
                            valueAnimatorOfFloat2.addListener(oz3Var2);
                            valueAnimatorOfFloat2.start();
                            Matrix matrix2 = actAvatarCrop.b1;
                            Point point2 = actAvatarCrop.a1;
                            matrix2.postScale(-1.0f, 1.0f, point2.x / 2.0f, point2.y / 2.0f);
                            break;
                        }
                        break;
                    case 2:
                        int i52 = ActAvatarCrop.d1;
                        actAvatarCrop.finish();
                        break;
                    case 3:
                        actAvatarCrop.c1 = false;
                        AvatarCropView avatarCropView = actAvatarCrop.U0;
                        oz3 oz3Var3 = (oz3) avatarCropView.getZoomableController();
                        oz3Var3.reset();
                        oz3Var3.e();
                        if (avatarCropView.O0 > 0 && avatarCropView.P0 == 0) {
                            ((oz3) avatarCropView.getZoomableController()).d(avatarCropView.O0);
                        }
                        avatarCropView.f(oz3Var3.k);
                        actAvatarCrop.b1.reset();
                        actAvatarCrop.Y0.setVisibility(8);
                        break;
                    default:
                        int i6 = ActAvatarCrop.d1;
                        ((y8a) ((ed3) actAvatarCrop.K0.b)).getClass();
                        jyc jycVar = jyc.a;
                        q1a q1aVar = new q1a(2, new l5(0, actAvatarCrop));
                        hle hleVarT = jycVar.t();
                        hleVarT.getClass();
                        q1aVar.m(((jle) hleVarT).a()).i(((jle) jycVar.t()).b()).k(new iq1(new qj3() { // from class: m5
                            @Override // defpackage.qj3
                            public final void accept(Object obj) {
                                ActAvatarCrop actAvatarCrop2 = actAvatarCrop;
                                switch (i42) {
                                    case 0:
                                        Rect rect = (Rect) obj;
                                        int i7 = ActAvatarCrop.d1;
                                        actAvatarCrop2.getClass();
                                        Intent intent = new Intent();
                                        intent.putExtra("ru.ok.tamtam.extra.CROPPED_ABSOLUTE", rect);
                                        Point point3 = actAvatarCrop2.a1;
                                        float f2 = rect.left;
                                        float f3 = point3.x;
                                        float f4 = rect.top;
                                        float f5 = point3.y;
                                        intent.putExtra("ru.ok.tamtam.extra.CROPPED_RECT", new RectF(f2 / f3, f4 / f5, rect.right / f3, rect.bottom / f5));
                                        intent.putExtra("ru.ok.tamtam.extra.URI", (Uri) actAvatarCrop2.getIntent().getParcelableExtra("ru.ok.tamtam.extra.URI"));
                                        intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", actAvatarCrop2.getIntent().getStringExtra("ru.ok.tamtam.extra.FILE_PATH"));
                                        actAvatarCrop2.setResult(-1, intent);
                                        actAvatarCrop2.finish();
                                        if (actAvatarCrop2.getIntent().getBooleanExtra("ru.ok.tamtam.extra.NO_ANIM ", false)) {
                                            actAvatarCrop2.overridePendingTransition(0, 0);
                                            break;
                                        }
                                        break;
                                    default:
                                        int i8 = ActAvatarCrop.d1;
                                        actAvatarCrop2.getClass();
                                        hm9.k("ru.ok.messages.views.ActAvatarCrop", "Error occurred during applying image transformation. Error: " + ((Throwable) obj).toString());
                                        actAvatarCrop2.setResult(0);
                                        int i9 = jpc.E;
                                        Handler handler = a14.i;
                                        a14.N(1, actAvatarCrop2, actAvatarCrop2.getString(i9));
                                        actAvatarCrop2.finish();
                                        break;
                                }
                            }
                        }, 2, new qj3() { // from class: m5
                            @Override // defpackage.qj3
                            public final void accept(Object obj) {
                                ActAvatarCrop actAvatarCrop2 = actAvatarCrop;
                                switch (i32) {
                                    case 0:
                                        Rect rect = (Rect) obj;
                                        int i7 = ActAvatarCrop.d1;
                                        actAvatarCrop2.getClass();
                                        Intent intent = new Intent();
                                        intent.putExtra("ru.ok.tamtam.extra.CROPPED_ABSOLUTE", rect);
                                        Point point3 = actAvatarCrop2.a1;
                                        float f2 = rect.left;
                                        float f3 = point3.x;
                                        float f4 = rect.top;
                                        float f5 = point3.y;
                                        intent.putExtra("ru.ok.tamtam.extra.CROPPED_RECT", new RectF(f2 / f3, f4 / f5, rect.right / f3, rect.bottom / f5));
                                        intent.putExtra("ru.ok.tamtam.extra.URI", (Uri) actAvatarCrop2.getIntent().getParcelableExtra("ru.ok.tamtam.extra.URI"));
                                        intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", actAvatarCrop2.getIntent().getStringExtra("ru.ok.tamtam.extra.FILE_PATH"));
                                        actAvatarCrop2.setResult(-1, intent);
                                        actAvatarCrop2.finish();
                                        if (actAvatarCrop2.getIntent().getBooleanExtra("ru.ok.tamtam.extra.NO_ANIM ", false)) {
                                            actAvatarCrop2.overridePendingTransition(0, 0);
                                            break;
                                        }
                                        break;
                                    default:
                                        int i8 = ActAvatarCrop.d1;
                                        actAvatarCrop2.getClass();
                                        hm9.k("ru.ok.messages.views.ActAvatarCrop", "Error occurred during applying image transformation. Error: " + ((Throwable) obj).toString());
                                        actAvatarCrop2.setResult(0);
                                        int i9 = jpc.E;
                                        Handler handler = a14.i;
                                        a14.N(1, actAvatarCrop2, actAvatarCrop2.getString(i9));
                                        actAvatarCrop2.finish();
                                        break;
                                }
                            }
                        }));
                        break;
                }
            }
        });
        this.U0 = (AvatarCropView) findViewById(xxb.crop);
        if (getIntent().getBooleanExtra("ru.ok.tamtam.extra.FOR_CHAT_BACKGROUND", false)) {
            this.U0.setMode(1);
            setRequestedOrientation(1);
        } else {
            this.U0.setMode(0);
        }
        this.U0.setZoomEnabled(true);
        AvatarCropView avatarCropView = this.U0;
        ma6 ma6Var = new ma6(getResources());
        ma6Var.l = ssc.o;
        ma6Var.b = 0;
        avatarCropView.setHierarchy(ma6Var.a());
        e2b e2bVar = s36.a.get();
        e2bVar.c(uri);
        e2bVar.h = new n5(i2, this);
        this.U0.setController(e2bVar.a());
        this.U0.setTransformChangeListener(this);
    }

    @Override // defpackage.q5, androidx.fragment.app.b, android.app.Activity
    public final void onResume() {
        super.onResume();
        an9 an9VarM = ((y8a) ((ed3) this.K0.b)).m();
        wuc wucVar = wuc.AVATAR_PICKER_CROP;
        spa spaVar = spa.f;
        an9VarM.f(wucVar, spa.f);
    }
}

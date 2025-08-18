package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import java.io.FileOutputStream;
import java.io.IOException;
import one.me.image.crop.view.ImageCropView;
import ru.ok.messages.media.crop.FrgTamCropImage;

/* loaded from: classes2.dex */
public final /* synthetic */ class c56 implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgTamCropImage b;

    public /* synthetic */ c56(FrgTamCropImage frgTamCropImage, int i) {
        this.a = i;
        this.b = frgTamCropImage;
    }

    @Override // defpackage.f6
    public final void run() throws IOException {
        q5 q5VarG1;
        switch (this.a) {
            case 0:
                FrgTamCropImage frgTamCropImage = this.b;
                ((y8a) ((ed3) frgTamCropImage.p1.b)).b().f("LOCAL_MEDIA_ROTATE");
                wa6 wa6Var = frgTamCropImage.B1.a;
                Matrix matrix = wa6Var.D0;
                matrix.reset();
                float currentScale = 1.0f / wa6Var.getCurrentScale();
                matrix.postScale(currentScale, currentScale);
                RectF rectF = wa6Var.E0;
                rectF.set(wa6Var.C0);
                matrix.mapRect(rectF);
                float fWidth = rectF.width();
                wa6 wa6Var2 = frgTamCropImage.B1.a;
                RectF rectF2 = wa6Var2.C0;
                float fCenterX = rectF2.centerX();
                float fCenterY = rectF2.centerY();
                Matrix matrix2 = wa6Var2.u0;
                matrix2.postRotate(90.0f, fCenterX, fCenterY);
                wa6Var2.setImageMatrix(matrix2);
                foa foaVar = frgTamCropImage.B1.b;
                float f = 1.0f / foaVar.t0;
                foaVar.t0 = f;
                RectF rectF3 = foaVar.a;
                foaVar.a(rectF3, f);
                foaVar.b();
                goa goaVar = foaVar.M0;
                if (goaVar != null) {
                    ((ImageCropView) goaVar).a.setCropRect(rectF3);
                }
                foaVar.postInvalidateOnAnimation();
                wa6 wa6Var3 = frgTamCropImage.B1.a;
                Matrix matrix3 = wa6Var3.D0;
                matrix3.reset();
                float currentScale2 = 1.0f / wa6Var3.getCurrentScale();
                matrix3.postScale(currentScale2, currentScale2);
                RectF rectF4 = wa6Var3.E0;
                rectF4.set(wa6Var3.C0);
                matrix3.mapRect(rectF4);
                float fHeight = rectF4.height() / fWidth;
                wa6 wa6Var4 = frgTamCropImage.B1.a;
                RectF rectF5 = wa6Var4.C0;
                float fCenterX2 = rectF5.centerX();
                float fCenterY2 = rectF5.centerY();
                if (fHeight != 0.0f) {
                    Matrix matrix4 = wa6Var4.u0;
                    matrix4.postScale(fHeight, fHeight, fCenterX2, fCenterY2);
                    wa6Var4.setImageMatrix(matrix4);
                }
                frgTamCropImage.B1.a();
                return;
            case 1:
                FrgTamCropImage frgTamCropImage2 = this.b;
                ((y8a) ((ed3) frgTamCropImage2.p1.b)).b().f("LOCAL_MEDIA_FLIP");
                wa6 wa6Var5 = frgTamCropImage2.B1.a;
                RectF rectF6 = wa6Var5.C0;
                float fCenterX3 = rectF6.centerX();
                float fCenterY3 = rectF6.centerY();
                Matrix matrix5 = wa6Var5.u0;
                matrix5.postScale(-1.0f, 1.0f, fCenterX3, fCenterY3);
                wa6Var5.setImageMatrix(matrix5);
                frgTamCropImage2.B1.a();
                return;
            case 2:
                wa6 wa6Var6 = this.b.B1.a;
                wa6Var6.F0 = 0.0f;
                wa6Var6.f();
                return;
            case 3:
                this.b.e1();
                return;
            case 4:
                FrgTamCropImage frgTamCropImage3 = this.b;
                frgTamCropImage3.getClass();
                new sa3(1, new c56(frgTamCropImage3, 5)).k(muc.a()).h(ce.a()).i(new iq1(new z16(5, frgTamCropImage3), 0, new c56(frgTamCropImage3, 6)));
                return;
            case 5:
                FrgTamCropImage frgTamCropImage4 = this.b;
                ImageCropView imageCropView = frgTamCropImage4.B1;
                Bitmap.CompressFormat compressFormat = frgTamCropImage4.Z.getBoolean("ru.ok.tamtam.extra.SAVE_AS_PNG") ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
                wa6 wa6Var7 = imageCropView.a;
                Bitmap viewBitmap = wa6Var7.getViewBitmap();
                String imageOutputPath = wa6Var7.getImageOutputPath();
                nz3 cropState = wa6Var7.getCropState();
                if (viewBitmap == null || viewBitmap.isRecycled()) {
                    throw new IllegalStateException("bitmap recycled or null");
                }
                Matrix matrix6 = new Matrix();
                matrix6.setValues(cropState.c);
                Matrix matrix7 = new Matrix();
                matrix7.set(matrix6);
                float fK = 1.0f / f46.K(matrix6);
                matrix7.postScale(fK, fK, 0.0f, 0.0f);
                float[] fArr = f46.c;
                matrix7.getValues(fArr);
                float f2 = -fArr[2];
                matrix7.getValues(fArr);
                matrix7.postTranslate(f2, -fArr[5]);
                RectF rectF7 = cropState.a;
                matrix7.mapRect(rectF7);
                matrix7.postTranslate(-rectF7.left, -rectF7.top);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) rectF7.width(), (int) rectF7.height(), Bitmap.Config.ARGB_8888);
                new Canvas(bitmapCreateBitmap).drawBitmap(viewBitmap, matrix7, null);
                FileOutputStream fileOutputStream = new FileOutputStream(imageOutputPath);
                try {
                    bitmapCreateBitmap.compress(compressFormat, 100, fileOutputStream);
                    bitmapCreateBitmap.recycle();
                    fileOutputStream.close();
                    return;
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            default:
                FrgTamCropImage frgTamCropImage5 = this.b;
                if (frgTamCropImage5.g1() == null || (q5VarG1 = frgTamCropImage5.g1()) == null) {
                    return;
                }
                Intent intent = new Intent();
                Uri uri = (Uri) frgTamCropImage5.Z.getParcelable("ru.ok.tamtam.extra.RESULT_URI");
                intent.putExtra("ru.ok.tamtam.extra.RESULT_URI", uri);
                hm9.m("ru.ok.messages.media.crop.FrgTamCropImage", "finishWithSuccess: result: %s", uri.toString());
                wa6 wa6Var8 = frgTamCropImage5.B1.a;
                if (!wa6Var8.getInitialMatrix().equals(wa6Var8.u0)) {
                    intent.putExtra("ru.ok.tamtam.extra.CROP_STATE", frgTamCropImage5.B1.getCropState());
                }
                q5VarG1.setResult(-1, intent);
                frgTamCropImage5.e1();
                return;
        }
    }
}

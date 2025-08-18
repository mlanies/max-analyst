package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class yt9 extends pu9 {
    public IconCompat e;
    public IconCompat f;
    public boolean g;

    @Override // defpackage.pu9
    public final void b(m5d m5dVar) {
        Bitmap bitmap;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) m5dVar.c).setBigContentTitle((CharSequence) this.c);
        IconCompat iconCompat = this.e;
        Context context = (Context) m5dVar.b;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                xt9.a(bigContentTitle, cs6.d(iconCompat, context));
            } else {
                int iC = iconCompat.a;
                if (iC == -1) {
                    iC = es6.c(iconCompat.b);
                }
                if (iC == 1) {
                    IconCompat iconCompat2 = this.e;
                    int i = iconCompat2.a;
                    if (i == -1) {
                        Object obj = iconCompat2.b;
                        bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                    } else if (i == 1) {
                        bitmap = (Bitmap) iconCompat2.b;
                    } else {
                        if (i != 5) {
                            throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                        }
                        Bitmap bitmap2 = (Bitmap) iconCompat2.b;
                        int iMin = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        Paint paint = new Paint(3);
                        float f = iMin;
                        float f2 = 0.5f * f;
                        float f3 = 0.9166667f * f2;
                        float f4 = 0.010416667f * f;
                        paint.setColor(0);
                        paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
                        canvas.drawCircle(f2, f2, f3, paint);
                        paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
                        canvas.drawCircle(f2, f2, f3, paint);
                        paint.clearShadowLayer();
                        paint.setColor(-16777216);
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                        Matrix matrix = new Matrix();
                        matrix.setTranslate((-(bitmap2.getWidth() - iMin)) / 2.0f, (-(bitmap2.getHeight() - iMin)) / 2.0f);
                        bitmapShader.setLocalMatrix(matrix);
                        paint.setShader(bitmapShader);
                        canvas.drawCircle(f2, f2, f3, paint);
                        canvas.setBitmap(null);
                        bitmap = bitmapCreateBitmap;
                    }
                    bigContentTitle = bigContentTitle.bigPicture(bitmap);
                }
            }
        }
        if (this.g) {
            IconCompat iconCompat3 = this.f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                wt9.a(bigContentTitle, cs6.d(iconCompat3, context));
            }
        }
        if (this.a) {
            bigContentTitle.setSummaryText((CharSequence) this.d);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            xt9.c(bigContentTitle, false);
            xt9.b(bigContentTitle, null);
        }
    }

    @Override // defpackage.pu9
    public final String e() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}

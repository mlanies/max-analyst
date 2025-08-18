package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.hardware.camera2.TotalCaptureResult;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.LogFactory;
import ru.ok.messages.media.trim.FrgTrimVideo;
import ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView;
import ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview;

/* loaded from: classes.dex */
public final /* synthetic */ class lt1 implements mq1, c7b, grd, jm7, qj3, u98, rj8, s0a, d38, eqc, bb3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lt1(long j, Object obj, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        long j = this.b;
        Object obj2 = this.c;
        switch (this.a) {
            case 4:
                hm9.m("dq7", "validateThumbnailUri: id = %d, result = %s, uri = %s", Long.valueOf(j), (Boolean) obj, (String) obj2);
                break;
            default:
                int i = VideoPlayerSeekBarPreview.E0;
                VideoPlayerSeekBarPreview videoPlayerSeekBarPreview = (VideoPlayerSeekBarPreview) obj2;
                videoPlayerSeekBarPreview.getClass();
                Locale locale = Locale.ENGLISH;
                hm9.p("ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview", "Can't extract frame millis = " + j, (Throwable) obj);
                cqc.b(videoPlayerSeekBarPreview.u0);
                videoPlayerSeekBarPreview.c.a(false);
                break;
        }
    }

    @Override // defpackage.eqc, defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.b));
        hc0 hc0Var = (hc0) this.c;
        String str = hc0Var.a;
        z8b z8bVar = hc0Var.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(d9b.a(z8bVar))}) < 1) {
            contentValues.put("backend_name", hc0Var.a);
            contentValues.put(LogFactory.PRIORITY_KEY, Integer.valueOf(d9b.a(z8bVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // defpackage.bb3
    public void b(ra3 ra3Var) {
        a9f a9fVar = (a9f) this.c;
        long j = this.b;
        a9fVar.getClass();
        hm9.n("a9f", "removeUploadWithAttachId: attachId=" + j);
        synchronized (a9fVar) {
            a9fVar.a.b(j).e(((y8f) a9fVar.b.getValue()).b(j)).a();
        }
        if (ra3Var.h()) {
            return;
        }
        ra3Var.b();
    }

    @Override // defpackage.u98
    public void c(qr6 qr6Var, int i) {
        qr6Var.X(((w98) this.c).c, i, this.b);
    }

    @Override // defpackage.d38
    public void d(j28 j28Var) {
        uy uyVar;
        rfc rfcVar = (rfc) this.c;
        fef fefVar = rfcVar.e;
        if (fefVar == null || (uyVar = ((ok0) fefVar).f) == null) {
            if (j28Var.h()) {
                return;
            }
            j28Var.onError(new IllegalStateException("Video content or collage is null"));
        } else {
            xv6 xv6VarD = xv6.d(Uri.parse((String) uyVar.Y));
            xv6VarD.l = new w26(rfcVar.e, this.b);
            g0 g0VarA = rfcVar.f.a(xv6VarD.a(), null);
            rfcVar.h = g0VarA;
            g0VarA.m(new qfc(j28Var), qq1.a);
        }
    }

    @Override // defpackage.s0a
    public void e(ez9 ez9Var) throws SecurityException, IllegalArgumentException {
        Bitmap bitmapCreateScaledBitmap;
        int i = 0;
        while (true) {
            float f = i;
            RangeSeekBarView rangeSeekBarView = (RangeSeekBarView) this.c;
            if (f >= rangeSeekBarView.M0 + 2.0f || ez9Var.h()) {
                break;
            }
            long j = (i * rangeSeekBarView.N0) + this.b;
            if (rangeSeekBarView.G0.get(j) == null) {
                FrgTrimVideo frgTrimVideo = rangeSeekBarView.I0;
                int i2 = rangeSeekBarView.L0;
                if (frgTrimVideo.B1 == null) {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    frgTrimVideo.B1 = mediaMetadataRetriever;
                    mediaMetadataRetriever.setDataSource(frgTrimVideo.d0(), frgTrimVideo.D1);
                }
                Bitmap frameAtTime = frgTrimVideo.B1.getFrameAtTime(TimeUnit.MILLISECONDS.toMicros(j), 2);
                if (frameAtTime == null) {
                    bitmapCreateScaledBitmap = null;
                } else {
                    int iMin = Math.min(frameAtTime.getWidth(), frameAtTime.getHeight());
                    int width = (frameAtTime.getWidth() - iMin) / 2;
                    int height = (frameAtTime.getHeight() - iMin) / 2;
                    Rect rect = new Rect(width, height, width + iMin, iMin + height);
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(Bitmap.createBitmap(frameAtTime, rect.left, rect.top, rect.width(), rect.height()), i2, i2, true);
                }
                if (bitmapCreateScaledBitmap != null) {
                    ez9Var.d(new mpa(Long.valueOf(j), bitmapCreateScaledBitmap));
                }
            }
            i++;
        }
        ez9Var.b();
    }

    @Override // defpackage.jm7, defpackage.km7
    public void invoke(Object obj) {
        ve8 ve8Var;
        u65 u65Var = (u65) obj;
        u65Var.getClass();
        u65.u();
        Object obj2 = this.c;
        hm9.m("u65", "videoDebugListener.onRenderedFirstFrame: output = %s renderTimeMs = %d", obj2 != null ? obj2.toString() : "", Long.valueOf(this.b));
        bq7 bq7Var = u65Var.Y;
        if (bq7Var == null || (ve8Var = bq7Var.e) == null) {
            return;
        }
        ve8Var.i0();
    }

    @Override // defpackage.grd
    public void j(nqd nqdVar) {
        zf2 zf2Var = (zf2) this.c;
        cu8 cu8VarQ = zf2Var.r.q(this.b);
        if (cu8VarQ != null) {
            zf2Var.t.e(cu8VarQ);
            zu8 zu8Var = zf2Var.u;
            zu8Var.getClass();
            nqdVar.a(zu8.a(zu8Var, cu8VarQ));
        }
    }

    @Override // defpackage.rj8
    public Object k(ii8 ii8Var, oh8 oh8Var, int i) {
        return ii8Var.q(oh8Var, zw6.n((tb8) this.c), 0, this.b);
    }

    @Override // defpackage.mq1
    public String q(final lq1 lq1Var) {
        st1 st1Var = (st1) this.c;
        st1Var.getClass();
        final long j = this.b;
        st1Var.p(new rt1() { // from class: mt1
            @Override // defpackage.rt1
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                if (!st1.x(totalCaptureResult, j)) {
                    return false;
                }
                lq1Var.b(null);
                return true;
            }
        });
        return "waitForSessionUpdateId:" + j;
    }

    @Override // defpackage.c7b
    public boolean test(Object obj) {
        e52 e52Var = (e52) obj;
        if (e52Var.b.f(this.b)) {
            if (e52Var.b.k <= 0) {
                return false;
            }
        } else {
            if (!p82.N.test(e52Var)) {
                return false;
            }
            c7b c7bVar = (c7b) this.c;
            if (c7bVar != null && !c7bVar.test(e52Var)) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ lt1(ed edVar, Object obj, long j) {
        this.a = 3;
        this.c = obj;
        this.b = j;
    }

    public /* synthetic */ lt1(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}

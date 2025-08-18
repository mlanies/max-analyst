package ru.ok.android.externcalls.sdk.api.retry;

import androidx.work.WorkRequest;
import defpackage.a4c;
import defpackage.a66;
import defpackage.e0a;
import defpackage.e5f;
import defpackage.iqd;
import defpackage.lf0;
import defpackage.m56;
import defpackage.muc;
import defpackage.p66;
import defpackage.q1a;
import defpackage.rd7;
import defpackage.s85;
import defpackage.yjc;
import java.io.IOException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import kotlin.Metadata;
import ru.ok.android.api.http.HttpStatusApiException;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

@Metadata(d1 = {"\u00000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\t\u0010\b\u001a9\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\b\u001a9\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\b\u001a9\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\b\u001a9\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\b\u001a9\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\b\u001aA\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u0017\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"", "T", "Liqd;", "", "isEnabled", "La4c;", "logger", "retryApiCallForOutgoing", "(Liqd;ZLa4c;)Liqd;", "retryApiCallForJoining", "retryApiCallForIncoming", "retryApiCallForBackgroundWork", "retryApiCallForFastWorkRequired", "retryWithFastBackoff", "retryWithSlowBackoff", "Llf0;", "backoff", "retryApiWithBackoff", "(Liqd;ZLa4c;Llf0;)Liqd;", "createFastBackoff", "()Llf0;", "createSlowBackoff", "", "throwable", "retryApiExceptionFilter", "(Ljava/lang/Throwable;)Z", "", "LOG_TAG", "Ljava/lang/String;", "calls-sdk_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class RetryKt {
    private static final String LOG_TAG = "CallsApiRetry";

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.api.retry.RetryKt$retryApiWithBackoff$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends p66 implements m56 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1, RetryKt.class, "retryApiExceptionFilter", "retryApiExceptionFilter(Ljava/lang/Throwable;)Z", 1);
        }

        @Override // defpackage.m56
        public final Boolean invoke(Throwable th) {
            return Boolean.valueOf(RetryKt.retryApiExceptionFilter(th));
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "T", "", "throwable", "", "attempt", "Le5f;", "invoke", "(Ljava/lang/Throwable;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.api.retry.RetryKt$retryApiWithBackoff$2, reason: invalid class name */
    public static final class AnonymousClass2 extends rd7 implements a66 {
        final /* synthetic */ a4c $logger;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(a4c a4cVar) {
            super(2);
            this.$logger = a4cVar;
        }

        @Override // defpackage.a66
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Throwable) obj, ((Number) obj2).intValue());
            return e5f.a;
        }

        public final void invoke(Throwable th, int i) {
            this.$logger.log(RetryKt.LOG_TAG, "retry attempt " + i + " after " + th);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "it", "Le5f;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.api.retry.RetryKt$retryApiWithBackoff$3, reason: invalid class name */
    public static final class AnonymousClass3 extends rd7 implements m56 {
        final /* synthetic */ a4c $logger;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(a4c a4cVar) {
            super(1);
            this.$logger = a4cVar;
        }

        @Override // defpackage.m56
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return e5f.a;
        }

        public final void invoke(Throwable th) {
            this.$logger.log(RetryKt.LOG_TAG, "retry failed with last exception " + th);
        }
    }

    private static final lf0 createFastBackoff() {
        return new lf0(new s85(15, 0L, 0.0f), MultiFileUploader.UPLOAD_NEXT_INTERVAL);
    }

    private static final lf0 createSlowBackoff() {
        return new lf0(new s85(10, 1000L, 2.0f), WorkRequest.MIN_BACKOFF_MILLIS);
    }

    public static final <T> iqd retryApiCallForBackgroundWork(iqd iqdVar, boolean z, a4c a4cVar) {
        return retryWithSlowBackoff(iqdVar, z, a4cVar);
    }

    public static final <T> iqd retryApiCallForFastWorkRequired(iqd iqdVar, boolean z, a4c a4cVar) {
        return retryWithFastBackoff(iqdVar, z, a4cVar);
    }

    public static final <T> iqd retryApiCallForIncoming(iqd iqdVar, boolean z, a4c a4cVar) {
        return retryWithSlowBackoff(iqdVar, z, a4cVar);
    }

    public static final <T> iqd retryApiCallForJoining(iqd iqdVar, boolean z, a4c a4cVar) {
        return retryWithFastBackoff(iqdVar, z, a4cVar);
    }

    public static final <T> iqd retryApiCallForOutgoing(iqd iqdVar, boolean z, a4c a4cVar) {
        return retryWithFastBackoff(iqdVar, z, a4cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean retryApiExceptionFilter(Throwable th) {
        if ((th instanceof UnknownHostException) || (th instanceof ConnectException) || (th instanceof NoRouteToHostException) || (th instanceof SocketException) || (th instanceof SSLProtocolException) || (th instanceof SSLPeerUnverifiedException) || (th instanceof SSLHandshakeException) || (th instanceof SSLException) || (th instanceof HttpRetryException)) {
            return true;
        }
        if (th instanceof HttpStatusApiException) {
            int i = ((HttpStatusApiException) th).a;
            if (i == 502 || i == 504) {
                return true;
            }
        } else if ((th instanceof ProtocolException) || (th instanceof IOException)) {
            return true;
        }
        return false;
    }

    private static final <T> iqd retryApiWithBackoff(iqd iqdVar, boolean z, a4c a4cVar, lf0 lf0Var) {
        if (!z) {
            a4cVar.log(LOG_TAG, "retry disabled");
            return iqdVar;
        }
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(a4cVar);
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(a4cVar);
        return new q1a(0, new e0a(iqdVar.n(), new yjc(anonymousClass1, lf0Var, anonymousClass2, muc.a(), anonymousClass3), 6));
    }

    private static final <T> iqd retryWithFastBackoff(iqd iqdVar, boolean z, a4c a4cVar) {
        return retryApiWithBackoff(iqdVar, z, a4cVar, createFastBackoff());
    }

    private static final <T> iqd retryWithSlowBackoff(iqd iqdVar, boolean z, a4c a4cVar) {
        return retryApiWithBackoff(iqdVar, z, a4cVar, createSlowBackoff());
    }
}

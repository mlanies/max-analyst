package ru.ok.android.externcalls.sdk.record;

import defpackage.k56;
import defpackage.m56;
import defpackage.u25;
import defpackage.v25;
import defpackage.z84;
import defpackage.zad;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.events.RecordEventListener;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001:\u0004\u001c\u001d\u001e\u001fJA\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJA\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\f2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u001b\u0010\u001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006 À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordManager;", "", "Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;", "params", "Lkotlin/Function0;", "Le5f;", "onSuccess", "Lkotlin/Function1;", "", "onError", "startRecord", "(Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/record/RecordManager$StopParams;", "stopRecord", "(Lru/ok/android/externcalls/sdk/record/RecordManager$StopParams;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/record/RecordDescription;", "getRecordDescription", "()Lru/ok/android/externcalls/sdk/record/RecordDescription;", "", "Lzad;", "Lru/ok/android/externcalls/sdk/record/RecordDescriptionHistory;", "getRecordDescriptionHistory", "()Ljava/util/Map;", "Lru/ok/android/externcalls/sdk/events/RecordEventListener;", "listener", "addRecordListener", "(Lru/ok/android/externcalls/sdk/events/RecordEventListener;)V", "removeRecordListener", "StartParams", "StartRecordInfo", "StopParams", "StopRecordInfo", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface RecordManager {

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u001a\u0018\u00002\u00020\u0001:\u0001,B\u0081\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0003\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b%\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b&\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b'\u0010\u001eR%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010(\u001a\u0004\b)\u0010*R%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010(\u001a\u0004\b+\u0010*¨\u0006-"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;", "", "", "isStream", "", "movieId", "", "albumId", "Lzad;", "sessionRoomId", "", "name", "description", "groupId", "privacy", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/record/RecordManager$StartRecordInfo;", "Le5f;", "onSuccess", "", "onError", "<init>", "(ZLjava/lang/Long;Ljava/lang/String;Lzad;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Long;Ljava/lang/String;Lm56;Lm56;)V", "Z", "()Z", "Ljava/lang/Long;", "getMovieId", "()Ljava/lang/Long;", "Ljava/lang/String;", "getAlbumId", "()Ljava/lang/String;", "Lzad;", "getSessionRoomId", "()Lzad;", "Ljava/lang/CharSequence;", "getName", "()Ljava/lang/CharSequence;", "getDescription", "getGroupId", "getPrivacy", "Lm56;", "getOnSuccess", "()Lm56;", "getOnError", "Builder", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class StartParams {
        private final String albumId;
        private final CharSequence description;
        private final Long groupId;
        private final boolean isStream;
        private final Long movieId;
        private final CharSequence name;
        private final m56 onError;
        private final m56 onSuccess;
        private final String privacy;
        private final zad sessionRoomId;

        @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0007J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001aJ!\u0010!\u001a\u00020\u00002\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d¢\u0006\u0004\b!\u0010\"J!\u0010%\u001a\u00020\u00002\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001f0\u001d¢\u0006\u0004\b%\u0010\"J\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010)R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010+R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010,R\u0016\u0010\u0013\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010,R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010*R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010-R$\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010.R$\u0010$\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010.R\u001c\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0018\u0010-\u0012\u0004\b/\u0010\u0003¨\u00060"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams$Builder;", "", "<init>", "()V", "", "movieId", "withMovieId", "(Ljava/lang/Long;)Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams$Builder;", "", "isStream", "(Z)Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams$Builder;", "Lzad;", "sessionRoomId", "withSessionRoomId", "(Lzad;)Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams$Builder;", "", "name", "withName", "(Ljava/lang/CharSequence;)Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams$Builder;", "description", "withDescription", "groupId", "withGroupId", "", "privacy", "withPrivacy", "(Ljava/lang/String;)Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams$Builder;", "albumId", "withAlbumId", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/record/RecordManager$StartRecordInfo;", "Le5f;", "onSuccess", "withCallOnSuccess", "(Lm56;)Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams$Builder;", "", "onError", "withCallOnError", "Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;", "build", "()Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;", "Z", "Ljava/lang/Long;", "Lzad;", "Ljava/lang/CharSequence;", "Ljava/lang/String;", "Lm56;", "getPrivacy$annotations", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
        public static final class Builder {
            private String albumId;
            private Long groupId;
            private boolean isStream;
            private Long movieId;
            private CharSequence name;
            private m56 onError;
            private m56 onSuccess;
            private zad sessionRoomId;
            private CharSequence description = "";
            private String privacy = "PUBLIC";

            private static /* synthetic */ void getPrivacy$annotations() {
            }

            public final StartParams build() {
                boolean z = this.isStream;
                Long l = this.movieId;
                zad zadVar = this.sessionRoomId;
                CharSequence charSequence = this.name;
                CharSequence charSequence2 = this.description;
                String str = this.privacy;
                return new StartParams(z, l, this.albumId, zadVar, charSequence, charSequence2, this.groupId, str, this.onSuccess, this.onError, null);
            }

            public final Builder isStream(boolean isStream) {
                this.isStream = isStream;
                return this;
            }

            public final Builder withAlbumId(String albumId) {
                this.albumId = albumId;
                return this;
            }

            public final Builder withCallOnError(m56 onError) {
                this.onError = onError;
                return this;
            }

            public final Builder withCallOnSuccess(m56 onSuccess) {
                this.onSuccess = onSuccess;
                return this;
            }

            public final Builder withDescription(CharSequence description) {
                this.description = description;
                return this;
            }

            public final Builder withGroupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            public final Builder withMovieId(Long movieId) {
                this.movieId = movieId;
                return this;
            }

            public final Builder withName(CharSequence name) {
                this.name = name;
                return this;
            }

            public final Builder withPrivacy(String privacy) {
                this.privacy = privacy;
                return this;
            }

            public final Builder withSessionRoomId(zad sessionRoomId) {
                this.sessionRoomId = sessionRoomId;
                return this;
            }
        }

        public /* synthetic */ StartParams(boolean z, Long l, String str, zad zadVar, CharSequence charSequence, CharSequence charSequence2, Long l2, String str2, m56 m56Var, m56 m56Var2, z84 z84Var) {
            this(z, l, str, zadVar, charSequence, charSequence2, l2, str2, m56Var, m56Var2);
        }

        public final String getAlbumId() {
            return this.albumId;
        }

        public final CharSequence getDescription() {
            return this.description;
        }

        public final Long getGroupId() {
            return this.groupId;
        }

        public final Long getMovieId() {
            return this.movieId;
        }

        public final CharSequence getName() {
            return this.name;
        }

        public final m56 getOnError() {
            return this.onError;
        }

        public final m56 getOnSuccess() {
            return this.onSuccess;
        }

        public final String getPrivacy() {
            return this.privacy;
        }

        public final zad getSessionRoomId() {
            return this.sessionRoomId;
        }

        /* renamed from: isStream, reason: from getter */
        public final boolean getIsStream() {
            return this.isStream;
        }

        private StartParams(boolean z, Long l, String str, zad zadVar, CharSequence charSequence, CharSequence charSequence2, Long l2, String str2, m56 m56Var, m56 m56Var2) {
            this.isStream = z;
            this.movieId = l;
            this.albumId = str;
            this.sessionRoomId = zadVar;
            this.name = charSequence;
            this.description = charSequence2;
            this.groupId = l2;
            this.privacy = str2;
            this.onSuccess = m56Var;
            this.onError = m56Var2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordManager$StartRecordInfo;", "", "()V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StartRecordInfo {
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000e\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordManager$StopParams;", "", "Lzad;", "sessionRoomId", "", "removeRecord", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/record/RecordManager$StopRecordInfo;", "Le5f;", "onSuccess", "", "onError", "<init>", "(Lzad;ZLm56;Lm56;)V", "Lzad;", "getSessionRoomId", "()Lzad;", "Z", "getRemoveRecord", "()Z", "Lm56;", "getOnSuccess", "()Lm56;", "getOnError", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class StopParams {
        private final m56 onError;
        private final m56 onSuccess;
        private final boolean removeRecord;
        private final zad sessionRoomId;

        public StopParams() {
            this(null, false, null, null, 15, null);
        }

        public final m56 getOnError() {
            return this.onError;
        }

        public final m56 getOnSuccess() {
            return this.onSuccess;
        }

        public final boolean getRemoveRecord() {
            return this.removeRecord;
        }

        public final zad getSessionRoomId() {
            return this.sessionRoomId;
        }

        public StopParams(zad zadVar, boolean z, m56 m56Var, m56 m56Var2) {
            this.sessionRoomId = zadVar;
            this.removeRecord = z;
            this.onSuccess = m56Var;
            this.onError = m56Var2;
        }

        public /* synthetic */ StopParams(zad zadVar, boolean z, m56 m56Var, m56 m56Var2, int i, z84 z84Var) {
            this((i & 1) != 0 ? null : zadVar, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : m56Var, (i & 8) != 0 ? null : m56Var2);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordManager$StopRecordInfo;", "", "removeResult", "Lru/ok/android/externcalls/sdk/record/RecordManager$StopRecordInfo$RemoveResult;", "(Lru/ok/android/externcalls/sdk/record/RecordManager$StopRecordInfo$RemoveResult;)V", "getRemoveResult", "()Lru/ok/android/externcalls/sdk/record/RecordManager$StopRecordInfo$RemoveResult;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "RemoveResult", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StopRecordInfo {
        private final RemoveResult removeResult;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordManager$StopRecordInfo$RemoveResult;", "", "(Ljava/lang/String;I)V", "NOT_REQUESTED", "REMOVED", "NOT_SUPPORTED", "NOT_REMOVED", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RemoveResult {
            private static final /* synthetic */ u25 $ENTRIES;
            private static final /* synthetic */ RemoveResult[] $VALUES;
            public static final RemoveResult NOT_REQUESTED = new RemoveResult("NOT_REQUESTED", 0);
            public static final RemoveResult REMOVED = new RemoveResult("REMOVED", 1);
            public static final RemoveResult NOT_SUPPORTED = new RemoveResult("NOT_SUPPORTED", 2);
            public static final RemoveResult NOT_REMOVED = new RemoveResult("NOT_REMOVED", 3);

            private static final /* synthetic */ RemoveResult[] $values() {
                return new RemoveResult[]{NOT_REQUESTED, REMOVED, NOT_SUPPORTED, NOT_REMOVED};
            }

            static {
                RemoveResult[] removeResultArr$values = $values();
                $VALUES = removeResultArr$values;
                $ENTRIES = new v25(removeResultArr$values);
            }

            private RemoveResult(String str, int i) {
            }

            public static u25 getEntries() {
                return $ENTRIES;
            }

            public static RemoveResult valueOf(String str) {
                return (RemoveResult) Enum.valueOf(RemoveResult.class, str);
            }

            public static RemoveResult[] values() {
                return (RemoveResult[]) $VALUES.clone();
            }
        }

        public StopRecordInfo(RemoveResult removeResult) {
            this.removeResult = removeResult;
        }

        public static /* synthetic */ StopRecordInfo copy$default(StopRecordInfo stopRecordInfo, RemoveResult removeResult, int i, Object obj) {
            if ((i & 1) != 0) {
                removeResult = stopRecordInfo.removeResult;
            }
            return stopRecordInfo.copy(removeResult);
        }

        /* renamed from: component1, reason: from getter */
        public final RemoveResult getRemoveResult() {
            return this.removeResult;
        }

        public final StopRecordInfo copy(RemoveResult removeResult) {
            return new StopRecordInfo(removeResult);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StopRecordInfo) && this.removeResult == ((StopRecordInfo) other).removeResult;
        }

        public final RemoveResult getRemoveResult() {
            return this.removeResult;
        }

        public int hashCode() {
            return this.removeResult.hashCode();
        }

        public String toString() {
            return "StopRecordInfo(removeResult=" + this.removeResult + ")";
        }
    }

    static /* synthetic */ void startRecord$default(RecordManager recordManager, StartParams startParams, k56 k56Var, m56 m56Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startRecord");
        }
        if ((i & 2) != 0) {
            k56Var = null;
        }
        if ((i & 4) != 0) {
            m56Var = null;
        }
        recordManager.startRecord(startParams, k56Var, m56Var);
    }

    static /* synthetic */ void stopRecord$default(RecordManager recordManager, StopParams stopParams, k56 k56Var, m56 m56Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopRecord");
        }
        if ((i & 2) != 0) {
            k56Var = null;
        }
        if ((i & 4) != 0) {
            m56Var = null;
        }
        recordManager.stopRecord(stopParams, k56Var, m56Var);
    }

    void addRecordListener(RecordEventListener listener);

    RecordDescription getRecordDescription();

    Map<zad, RecordDescriptionHistory> getRecordDescriptionHistory();

    void removeRecordListener(RecordEventListener listener);

    void startRecord(StartParams params, k56 onSuccess, m56 onError);

    void stopRecord(StopParams params, k56 onSuccess, m56 onError);
}

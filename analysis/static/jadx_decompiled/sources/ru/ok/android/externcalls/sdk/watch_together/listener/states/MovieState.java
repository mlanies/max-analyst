package ru.ok.android.externcalls.sdk.watch_together.listener.states;

import defpackage.fd9;
import defpackage.ms2;
import defpackage.qd9;
import defpackage.tpa;
import defpackage.z84;
import defpackage.zc9;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0010\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0018\u001a\u00020\tHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJU\u0010\u001e\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b\b\u0010\u0015R\u001d\u0010\n\u001a\u00020\t8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b\u000b\u0010\u0015R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b0\u0010\u001b\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieState;", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantId", "Lfd9;", "position", "", "isPlaying", "Lqd9;", "volume", "isMuted", "Lzc9;", "movie", "<init>", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lfd9;ZFZLzc9;Lz84;)V", "component1", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "component2", "()Lfd9;", "component3", "()Z", "component4-_pGdNCs", "()F", "component4", "component5", "component6", "()Lzc9;", "copy-brw6TxU", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lfd9;ZFZLzc9;)Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieState;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getParticipantId", "Lfd9;", "getPosition", "Z", "F", "getVolume-_pGdNCs", "Lzc9;", "getMovie", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final /* data */ class MovieState {
    private final boolean isMuted;
    private final boolean isPlaying;
    private final zc9 movie;
    private final ParticipantId participantId;
    private final fd9 position;
    private final float volume;

    public /* synthetic */ MovieState(ParticipantId participantId, fd9 fd9Var, boolean z, float f, boolean z2, zc9 zc9Var, z84 z84Var) {
        this(participantId, fd9Var, z, f, z2, zc9Var);
    }

    /* renamed from: copy-brw6TxU$default, reason: not valid java name */
    public static /* synthetic */ MovieState m127copybrw6TxU$default(MovieState movieState, ParticipantId participantId, fd9 fd9Var, boolean z, float f, boolean z2, zc9 zc9Var, int i, Object obj) {
        if ((i & 1) != 0) {
            participantId = movieState.participantId;
        }
        if ((i & 2) != 0) {
            fd9Var = movieState.position;
        }
        fd9 fd9Var2 = fd9Var;
        if ((i & 4) != 0) {
            z = movieState.isPlaying;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            f = movieState.volume;
        }
        float f2 = f;
        if ((i & 16) != 0) {
            z2 = movieState.isMuted;
        }
        boolean z4 = z2;
        if ((i & 32) != 0) {
            zc9Var = movieState.movie;
        }
        return movieState.m129copybrw6TxU(participantId, fd9Var2, z3, f2, z4, zc9Var);
    }

    /* renamed from: component1, reason: from getter */
    public final ParticipantId getParticipantId() {
        return this.participantId;
    }

    /* renamed from: component2, reason: from getter */
    public final fd9 getPosition() {
        return this.position;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsPlaying() {
        return this.isPlaying;
    }

    /* renamed from: component4-_pGdNCs, reason: not valid java name and from getter */
    public final float getVolume() {
        return this.volume;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsMuted() {
        return this.isMuted;
    }

    /* renamed from: component6, reason: from getter */
    public final zc9 getMovie() {
        return this.movie;
    }

    /* renamed from: copy-brw6TxU, reason: not valid java name */
    public final MovieState m129copybrw6TxU(ParticipantId participantId, fd9 position, boolean isPlaying, float volume, boolean isMuted, zc9 movie) {
        return new MovieState(participantId, position, isPlaying, volume, isMuted, movie, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MovieState)) {
            return false;
        }
        MovieState movieState = (MovieState) other;
        if (!tpa.f(this.participantId, movieState.participantId) || !tpa.f(this.position, movieState.position) || this.isPlaying != movieState.isPlaying) {
            return false;
        }
        float f = this.volume;
        float f2 = movieState.volume;
        float f3 = qd9.a;
        return Float.compare(f, f2) == 0 && this.isMuted == movieState.isMuted && tpa.f(this.movie, movieState.movie);
    }

    public final zc9 getMovie() {
        return this.movie;
    }

    public final ParticipantId getParticipantId() {
        return this.participantId;
    }

    public final fd9 getPosition() {
        return this.position;
    }

    /* renamed from: getVolume-_pGdNCs, reason: not valid java name */
    public final float m130getVolume_pGdNCs() {
        return this.volume;
    }

    public int hashCode() {
        int iD = ms2.d((this.position.hashCode() + (this.participantId.hashCode() * 31)) * 31, 31, this.isPlaying);
        float f = this.volume;
        float f2 = qd9.a;
        int iD2 = ms2.d(ms2.c(iD, f, 31), 31, this.isMuted);
        zc9 zc9Var = this.movie;
        return iD2 + (zc9Var == null ? 0 : zc9Var.hashCode());
    }

    public final boolean isMuted() {
        return this.isMuted;
    }

    public final boolean isPlaying() {
        return this.isPlaying;
    }

    public String toString() {
        ParticipantId participantId = this.participantId;
        fd9 fd9Var = this.position;
        boolean z = this.isPlaying;
        float f = this.volume;
        float f2 = qd9.a;
        return "MovieState(participantId=" + participantId + ", position=" + fd9Var + ", isPlaying=" + z + ", volume=" + ("MovieVolume(value=" + f + ")") + ", isMuted=" + this.isMuted + ", movie=" + this.movie + ")";
    }

    private MovieState(ParticipantId participantId, fd9 fd9Var, boolean z, float f, boolean z2, zc9 zc9Var) {
        this.participantId = participantId;
        this.position = fd9Var;
        this.isPlaying = z;
        this.volume = f;
        this.isMuted = z2;
        this.movie = zc9Var;
    }
}

package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzm implements Creator {
    static void zza(StreetViewPanoramaOrientation streetViewPanoramaOrientation, Parcel parcel, int i) {
        int zzak = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, streetViewPanoramaOrientation.getVersionCode());
        zzb.zza(parcel, 2, streetViewPanoramaOrientation.tilt);
        zzb.zza(parcel, 3, streetViewPanoramaOrientation.bearing);
        zzb.zzH(parcel, zzak);
    }

    public Object createFromParcel(Parcel parcel) {
        return zzfi(parcel);
    }

    public Object[] newArray(int i) {
        return zzhI(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.maps.model.StreetViewPanoramaOrientation zzfi(android.os.Parcel r8) {
        /*
        r7 = this;
        r0 = 0;
        r3 = com.google.android.gms.maps.model.LatLng.a;
        r4 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r8);
        r1 = 0;
        r2 = r1;
        r1 = r0;
    L_0x000a:
        r5 = r8.dataPosition();
        if (r5 >= r4) goto L_0x0020;
    L_0x0010:
        r5 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r8);
        r6 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r5);
        switch(r6) {
            case 1: goto L_0x0042;
            case 2: goto L_0x0048;
            case 3: goto L_0x004e;
            default: goto L_0x001b;
        };
    L_0x001b:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r8, r5);	 Catch:{ zza -> 0x0055 }
    L_0x001e:
        if (r3 == 0) goto L_0x000a;
    L_0x0020:
        r3 = r8.dataPosition();	 Catch:{ zza -> 0x0040 }
        if (r3 == r4) goto L_0x0057;
    L_0x0026:
        r0 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x0040 }
        r1 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x0040 }
        r1.<init>();	 Catch:{ zza -> 0x0040 }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ zza -> 0x0040 }
        r1 = r1.append(r4);	 Catch:{ zza -> 0x0040 }
        r1 = r1.toString();	 Catch:{ zza -> 0x0040 }
        r0.<init>(r1, r8);	 Catch:{ zza -> 0x0040 }
        throw r0;	 Catch:{ zza -> 0x0040 }
    L_0x0040:
        r0 = move-exception;
        throw r0;
    L_0x0042:
        r2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r8, r5);
        if (r3 == 0) goto L_0x001e;
    L_0x0048:
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zzl(r8, r5);
        if (r3 == 0) goto L_0x001e;
    L_0x004e:
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zzl(r8, r5);
        if (r3 == 0) goto L_0x001e;
    L_0x0054:
        goto L_0x001b;
    L_0x0055:
        r0 = move-exception;
        throw r0;
    L_0x0057:
        r3 = new com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
        r3.<init>(r2, r1, r0);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.zzm.zzfi(android.os.Parcel):com.google.android.gms.maps.model.StreetViewPanoramaOrientation");
    }

    public StreetViewPanoramaOrientation[] zzhI(int i) {
        return new StreetViewPanoramaOrientation[i];
    }
}

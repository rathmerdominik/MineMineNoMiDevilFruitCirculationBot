package com.hammerclock.dfcirc.types;

import java.util.Optional;
import xyz.pixelatedw.mineminenomi.api.OneFruitEntry;

public class FruitData {
   public final String devilFruitName;
   public final String devilFruitKey;
   public final Optional<OneFruitEntry.Status> devilFruitStatus;
   public final TierBox devilFruitTier;

   public FruitData(String devilFruitName, String devilFruitKey, OneFruitEntry.Status devilFruitStatus, TierBox devilFruitTier) {
      this.devilFruitName = devilFruitName;
      this.devilFruitKey = devilFruitKey;
      this.devilFruitStatus = Optional.ofNullable(devilFruitStatus);
      this.devilFruitTier = devilFruitTier;
   }
}

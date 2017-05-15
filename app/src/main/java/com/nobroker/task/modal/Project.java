package com.nobroker.task.modal;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ManjeetSingh on 5/13/2017.
 */

public class Project {

    private String parking;

    private String secondaryTitle;

    private Long dateOnly;

    private String buildingName;

    private Long deposit;

    private String location;

    private String street;

    private Score score;

    private String parkingDesc;

    private Boolean forLease;

    private String type;

    private Integer bathroom;

    private String city;

    private Integer pinCode;

    private Boolean photoAvailable;

    private Integer totalFloor;

    private String description;

    private Long propertySize;

    private String accomodationTypeDesc;

    private String shortUrl;

    private Double longitude;

    private Boolean gym;

    private Boolean sharedAccomodation;

    private Boolean shortlistedByLoggedInUser;

    private String propertyTitle;

    private String ownerName;

    private String furnishing;

    private Integer balconies;

    private Integer propertyAge;

    private Integer cupBoard;

    private String powerBackup;

    private Boolean accurateLocation;

    private String adminEvent;

    private Object managed;

    private Integer floor;

    private AmenitiesMap amenitiesMap;

    private Object inactiveReasonDesc;

    private Boolean swimmingPool;

    private Boolean lift;

    private Long availableFrom;

    private Boolean active;

    private String buildingType;

    private String localityId;

    private Double latitude;

    private Double weight;

    private String ownerId;

    private Boolean loanAvailable;

    private Boolean negotiable;

    private Long activationDate;

    private String id;

    private String title;

    private String facingDesc;

    private String propertyCode;

    private Double rent;

    private Object buildingId;

    private Object builderName;

    private String detailUrl;

    private String furnishingDesc;

    private String amenities;

    private String society;

    private Object accomodationType;

    private String tenantTypeDesc;

    private String typeDesc;

    private String leaseType;

    private Long lastUpdateDate;

    private Photos[] photos;

    private String creationDate;

    private String waterSupply;

    private String propertyType;

    private Object inactiveReason;

    private String facing;

    private String locality;

    private String nbLocality;

    private String sponsored;

    public Project(String parking, String secondaryTitle, Long dateOnly, String buildingName, Long deposit, String location,
                 String street, Score score, String parkingDesc, Boolean forLease, String type,Integer bathroom, String city,
                   Integer pinCode, Boolean photoAvailable, Integer totalFloor, String description, String accomodationTypeDesc,
                   Long propertySize, Double longitude, Double latitude, String shortUrl, Boolean gym, Boolean sharedAccomodation,
                   Boolean shortlistedByLoggedInUser, String propertyTitle, String ownerName, String furnishing, Integer balconies,
                   Integer propertyAge, Integer cupBoard, String powerBackup, Boolean accurateLocation, String adminEvent,String managed,
                   Integer floor, AmenitiesMap amenitiesMap, String inactiveReasonDesc, Boolean swimmingPool, Boolean lift,
                   Long availableFrom, Boolean active, String buildingType, String localityId, Double weight, String ownerId,
                   Boolean loanAvailable, Boolean negotiable, Long activationDate, String id, String facingDesc, String title,
                   String propertyCode, Double rent, String buildingId, String detailUrl, String builderName, String furnishingDesc,
                   String amenities, String society, String accomodationType, String tenantTypeDesc, String typeDesc,
                   String leaseType, Long lastUpdateDate) {

        this.title =title;
        this.lastUpdateDate = lastUpdateDate;
        this.leaseType =leaseType;
        this.typeDesc = typeDesc;
        this.tenantTypeDesc = tenantTypeDesc;
        this.accomodationType = accomodationType;
        this.society = society;
        this.amenities =amenities;
        this.furnishingDesc = furnishingDesc;
        this.rent = rent;
        this.detailUrl =detailUrl;
        this.builderName = builderName;
        this.buildingId = buildingId;
        this.propertyCode = propertyCode;
        this.facingDesc =facingDesc;
        this.parking = parking;
        this.secondaryTitle = secondaryTitle;
        this.dateOnly = dateOnly;
        this.buildingName = buildingName;
        this.deposit = deposit;
        this.location = location;
        this.street = street;
        this.score = score;
        this.parkingDesc = parkingDesc;
        this.forLease = forLease;
        this.type = type;
        this.bathroom = bathroom;
        this.city = city;
        this.pinCode = pinCode;
        this.photoAvailable = photoAvailable;
        this.totalFloor = totalFloor;
        this.description = description;
        this.accomodationTypeDesc = accomodationTypeDesc;
        this.propertySize = propertySize;
        this.longitude = longitude;
        this.latitude = latitude;
        this.shortUrl = shortUrl;
        this.gym = gym;
        this.sharedAccomodation = sharedAccomodation;
        this.shortlistedByLoggedInUser = shortlistedByLoggedInUser;
        this.propertyTitle = propertyTitle;
        this.ownerName = ownerName;
        this.furnishing = furnishing;
        this.balconies = balconies;
        this.propertyAge = propertyAge;
        this.cupBoard = cupBoard;
        this.powerBackup = powerBackup;
        this.accurateLocation = accurateLocation;
        this.adminEvent = adminEvent;
        this.managed = managed;
        this.floor = floor;
        this.amenitiesMap = amenitiesMap;
        this.inactiveReasonDesc =inactiveReasonDesc;
        this.swimmingPool = swimmingPool;
        this.lift = lift;
        this.availableFrom =availableFrom;
        this.active = active;
        this.buildingType = buildingType;
        this.localityId = localityId;
        this.weight = weight;
        this.ownerId =ownerId;
        this.loanAvailable =loanAvailable;
        this.negotiable = negotiable;
        this.activationDate = activationDate;
        this.id = id;

    }


    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    public String getSecondaryTitle() {
        return secondaryTitle;
    }

    public void setSecondaryTitle(String secondaryTitle) {
        this.secondaryTitle = secondaryTitle;
    }

    public Long getDateOnly() {
        return dateOnly;
    }

    public void setDateOnly(Long dateOnly) {
        this.dateOnly = dateOnly;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public Long getDeposit() {
        return deposit;
    }

    public void setDeposit(Long deposit) {
        this.deposit = deposit;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public String getParkingDesc() {
        return parkingDesc;
    }

    public void setParkingDesc(String parkingDesc) {
        this.parkingDesc = parkingDesc;
    }

    public Boolean getForLease() {
        return forLease;
    }

    public void setForLease(Boolean forLease) {
        this.forLease = forLease;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getBathroom() {
        return bathroom;
    }

    public void setBathroom(Integer bathroom) {
        this.bathroom = bathroom;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPinCode() {
        return pinCode;
    }

    public void setPinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }

    public Boolean getPhotoAvailable() {
        return photoAvailable;
    }

    public void setPhotoAvailable(Boolean photoAvailable) {
        this.photoAvailable = photoAvailable;
    }

    public Integer getTotalFloor() {
        return totalFloor;
    }

    public void setTotalFloor(Integer totalFloor) {
        this.totalFloor = totalFloor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getPropertySize() {
        return propertySize;
    }

    public void setPropertySize(Long propertySize) {
        this.propertySize = propertySize;
    }

    public String getAccomodationTypeDesc() {
        return accomodationTypeDesc;
    }

    public void setAccomodationTypeDesc(String accomodationTypeDesc) {
        this.accomodationTypeDesc = accomodationTypeDesc;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Boolean getGym() {
        return gym;
    }

    public void setGym(Boolean gym) {
        this.gym = gym;
    }

    public Boolean getSharedAccomodation() {
        return sharedAccomodation;
    }

    public void setSharedAccomodation(Boolean sharedAccomodation) {
        this.sharedAccomodation = sharedAccomodation;
    }

    public Boolean getShortlistedByLoggedInUser() {
        return shortlistedByLoggedInUser;
    }

    public void setShortlistedByLoggedInUser(Boolean shortlistedByLoggedInUser) {
        this.shortlistedByLoggedInUser = shortlistedByLoggedInUser;
    }

    public String getPropertyTitle() {
        return propertyTitle;
    }

    public void setPropertyTitle(String propertyTitle) {
        this.propertyTitle = propertyTitle;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getFurnishing() {
        return furnishing;
    }

    public void setFurnishing(String furnishing) {
        this.furnishing = furnishing;
    }

    public Integer getBalconies() {
        return balconies;
    }

    public void setBalconies(Integer balconies) {
        this.balconies = balconies;
    }

    public Integer getPropertyAge() {
        return propertyAge;
    }

    public void setPropertyAge(Integer propertyAge) {
        this.propertyAge = propertyAge;
    }

    public Integer getCupBoard() {
        return cupBoard;
    }

    public void setCupBoard(Integer cupBoard) {
        this.cupBoard = cupBoard;
    }

    public String getPowerBackup() {
        return powerBackup;
    }

    public void setPowerBackup(String powerBackup) {
        this.powerBackup = powerBackup;
    }

    public Boolean getAccurateLocation() {
        return accurateLocation;
    }

    public void setAccurateLocation(Boolean accurateLocation) {
        this.accurateLocation = accurateLocation;
    }

    public String getAdminEvent() {
        return adminEvent;
    }

    public void setAdminEvent(String adminEvent) {
        this.adminEvent = adminEvent;
    }

    public Object getManaged() {
        return managed;
    }

    public void setManaged(Object managed) {
        this.managed = managed;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public AmenitiesMap getAmenitiesMap() {
        return amenitiesMap;
    }

    public void setAmenitiesMap(AmenitiesMap amenitiesMap) {
        this.amenitiesMap = amenitiesMap;
    }

    public Object getInactiveReasonDesc() {
        return inactiveReasonDesc;
    }

    public void setInactiveReasonDesc(Object inactiveReasonDesc) {
        this.inactiveReasonDesc = inactiveReasonDesc;
    }

    public Boolean getSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(Boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public Boolean getLift() {
        return lift;
    }

    public void setLift(Boolean lift) {
        this.lift = lift;
    }

    public Long getAvailableFrom() {
        return availableFrom;
    }

    public void setAvailableFrom(Long availableFrom) {
        this.availableFrom = availableFrom;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public String getLocalityId() {
        return localityId;
    }

    public void setLocalityId(String localityId) {
        this.localityId = localityId;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public Boolean getLoanAvailable() {
        return loanAvailable;
    }

    public void setLoanAvailable(Boolean loanAvailable) {
        this.loanAvailable = loanAvailable;
    }

    public Boolean getNegotiable() {
        return negotiable;
    }

    public void setNegotiable(Boolean negotiable) {
        this.negotiable = negotiable;
    }

    public Long getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(Long activationDate) {
        this.activationDate = activationDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFacingDesc() {
        return facingDesc;
    }

    public void setFacingDesc(String facingDesc) {
        this.facingDesc = facingDesc;
    }

    public String getPropertyCode() {
        return propertyCode;
    }

    public void setPropertyCode(String propertyCode) {
        this.propertyCode = propertyCode;
    }

    public Double getRent() {
        return rent;
    }

    public void setRent(Double rent) {
        this.rent = rent;
    }

    public Object getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Object buildingId) {
        this.buildingId = buildingId;
    }

    public Object getBuilderName() {
        return builderName;
    }

    public void setBuilderName(Object builderName) {
        this.builderName = builderName;
    }

    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public String getFurnishingDesc() {
        return furnishingDesc;
    }

    public void setFurnishingDesc(String furnishingDesc) {
        this.furnishingDesc = furnishingDesc;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    public String getSociety() {
        return society;
    }

    public void setSociety(String society) {
        this.society = society;
    }

    public Object getAccomodationType() {
        return accomodationType;
    }

    public void setAccomodationType(Object accomodationType) {
        this.accomodationType = accomodationType;
    }

    public String getTenantTypeDesc() {
        return tenantTypeDesc;
    }

    public void setTenantTypeDesc(String tenantTypeDesc) {
        this.tenantTypeDesc = tenantTypeDesc;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public String getLeaseType() {
        return leaseType;
    }

    public void setLeaseType(String leaseType) {
        this.leaseType = leaseType;
    }

    public Long getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Long lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Photos[] getPhotos() {
        return photos;
    }

    public void setPhotos(Photos[] photos) {
        this.photos = photos;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getWaterSupply() {
        return waterSupply;
    }

    public void setWaterSupply(String waterSupply) {
        this.waterSupply = waterSupply;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public Object getInactiveReason() {
        return inactiveReason;
    }

    public void setInactiveReason(Object inactiveReason) {
        this.inactiveReason = inactiveReason;
    }

    public String getFacing() {
        return facing;
    }

    public void setFacing(String facing) {
        this.facing = facing;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getNbLocality() {
        return nbLocality;
    }

    public void setNbLocality(String nbLocality) {
        this.nbLocality = nbLocality;
    }

    public String getSponsored() {
        return sponsored;
    }

    public void setSponsored(String sponsored) {
        this.sponsored = sponsored;
    }

    @Override
    public String toString() {
        return "ClassPojo [parking = " + parking + ", secondaryTitle = " + secondaryTitle + ", dateOnly = " + dateOnly + ", buildingName = " + buildingName + ", deposit = " + deposit + ", location = " + location + ", street = " + street + ", score = " + score + ", parkingDesc = " + parkingDesc + ", forLease = " + forLease + ", type = " + type + ", bathroom = " + bathroom + ", city = " + city + ", pinCode = " + pinCode + ", photoAvailable = " + photoAvailable + ", totalFloor = " + totalFloor + ", description = " + description + ", propertySize = " + propertySize + ", accomodationTypeDesc = " + accomodationTypeDesc + ", shortUrl = " + shortUrl + ", longitude = " + longitude + ", gym = " + gym + ", sharedAccomodation = " + sharedAccomodation + ", shortlistedByLoggedInUser = " + shortlistedByLoggedInUser + ", propertyTitle = " + propertyTitle + ", ownerName = " + ownerName + ", furnishing = " + furnishing + ", balconies = " + balconies + ", propertyAge = " + propertyAge + ", cupBoard = " + cupBoard + ", powerBackup = " + powerBackup + ", accurateLocation = " + accurateLocation + ", adminEvent = " + adminEvent + ", managed = " + managed + ", floor = " + floor + ", amenitiesMap = " + amenitiesMap + ", inactiveReasonDesc = " + inactiveReasonDesc + ", swimmingPool = " + swimmingPool + ", lift = " + lift + ", availableFrom = " + availableFrom + ", active = " + active + ", buildingType = " + buildingType + ", localityId = " + localityId + ", latitude = " + latitude + ", weight = " + weight + ", ownerId = " + ownerId + ", loanAvailable = " + loanAvailable + ", negotiable = " + negotiable + ", activationDate = " + activationDate + ", id = " + id + ", title = " + title + ", facingDesc = " + facingDesc + ", propertyCode = " + propertyCode + ", rent = " + rent + ", buildingId = " + buildingId + ", builderName = " + builderName + ", detailUrl = " + detailUrl + ", furnishingDesc = " + furnishingDesc + ", amenities = " + amenities + ", society = " + society + ", accomodationType = " + accomodationType + ", tenantTypeDesc = " + tenantTypeDesc + ", typeDesc = " + typeDesc + ", leaseType = " + leaseType + ", lastUpdateDate = " + lastUpdateDate + ", photos = " + photos + ", creationDate = " + creationDate + ", waterSupply = " + waterSupply + ", propertyType = " + propertyType + ", inactiveReason = " + inactiveReason + ", facing = " + facing + ", locality = " + locality + ", nbLocality = " + nbLocality + ", sponsored = " + sponsored + "]";
    }


    public class Photos {
        private String title;

        private ImagesMap imagesMap;

        private String name;

        private String displayPic;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public ImagesMap getImagesMap() {
            return imagesMap;
        }

        public void setImagesMap(ImagesMap imagesMap) {
            this.imagesMap = imagesMap;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDisplayPic() {
            return displayPic;
        }

        public void setDisplayPic(String displayPic) {
            this.displayPic = displayPic;
        }

        @Override
        public String toString() {
            return "ClassPojo [title = " + title + ", imagesMap = " + imagesMap + ", name = " + name + ", displayPic = " + displayPic + "]";
        }
    }

    public class ImagesMap {
        private String thumbnail;

        private String original;

        private String medium;

        private String large;

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public String getOriginal() {
            return original;
        }

        public void setOriginal(String original) {
            this.original = original;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }

        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        @Override
        public String toString() {
            return "ClassPojo [thumbnail = " + thumbnail + ", original = " + original + ", medium = " + medium + ", large = " + large + "]";
        }
    }


    public class AmenitiesMap {
        private String CLUB;

        private String HK;

        private String INTERNET;

        private String SC;

        private String VP;

        private String RWH;

        private String POOL;

        private String LIFT;

        private String AC;

        private String INTERCOM;

        private String FS;

        private String PARK;

        private String GP;

        private String CPA;

        private String GYM;

        private String SECURITY;

        private String SERVANT;

        private String STP;

        private String PB;

        public String getCLUB() {
            return CLUB;
        }

        public void setCLUB(String CLUB) {
            this.CLUB = CLUB;
        }

        public String getHK() {
            return HK;
        }

        public void setHK(String HK) {
            this.HK = HK;
        }

        public String getINTERNET() {
            return INTERNET;
        }

        public void setINTERNET(String INTERNET) {
            this.INTERNET = INTERNET;
        }

        public String getSC() {
            return SC;
        }

        public void setSC(String SC) {
            this.SC = SC;
        }

        public String getVP() {
            return VP;
        }

        public void setVP(String VP) {
            this.VP = VP;
        }

        public String getRWH() {
            return RWH;
        }

        public void setRWH(String RWH) {
            this.RWH = RWH;
        }

        public String getPOOL() {
            return POOL;
        }

        public void setPOOL(String POOL) {
            this.POOL = POOL;
        }

        public String getLIFT() {
            return LIFT;
        }

        public void setLIFT(String LIFT) {
            this.LIFT = LIFT;
        }

        public String getAC() {
            return AC;
        }

        public void setAC(String AC) {
            this.AC = AC;
        }

        public String getINTERCOM() {
            return INTERCOM;
        }

        public void setINTERCOM(String INTERCOM) {
            this.INTERCOM = INTERCOM;
        }

        public String getFS() {
            return FS;
        }

        public void setFS(String FS) {
            this.FS = FS;
        }

        public String getPARK() {
            return PARK;
        }

        public void setPARK(String PARK) {
            this.PARK = PARK;
        }

        public String getGP() {
            return GP;
        }

        public void setGP(String GP) {
            this.GP = GP;
        }

        public String getCPA() {
            return CPA;
        }

        public void setCPA(String CPA) {
            this.CPA = CPA;
        }

        public String getGYM() {
            return GYM;
        }

        public void setGYM(String GYM) {
            this.GYM = GYM;
        }

        public String getSECURITY() {
            return SECURITY;
        }

        public void setSECURITY(String SECURITY) {
            this.SECURITY = SECURITY;
        }

        public String getSERVANT() {
            return SERVANT;
        }

        public void setSERVANT(String SERVANT) {
            this.SERVANT = SERVANT;
        }

        public String getSTP() {
            return STP;
        }

        public void setSTP(String STP) {
            this.STP = STP;
        }

        public String getPB() {
            return PB;
        }

        public void setPB(String PB) {
            this.PB = PB;
        }

        @Override
        public String toString() {
            return "ClassPojo [CLUB = " + CLUB + ", HK = " + HK + ", INTERNET = " + INTERNET + ", SC = " + SC + ", VP = " + VP + ", RWH = " + RWH + ", POOL = " + POOL + ", LIFT = " + LIFT + ", AC = " + AC + ", INTERCOM = " + INTERCOM + ", FS = " + FS + ", PARK = " + PARK + ", GP = " + GP + ", CPA = " + CPA + ", GYM = " + GYM + ", SECURITY = " + SECURITY + ", SERVANT = " + SERVANT + ", STP = " + STP + ", PB = " + PB + "]";
        }
    }


    public class Score {
        private String lifestyle;

        private String lastUpdatedDate;

        private String transit;

        public String getLifestyle() {
            return lifestyle;
        }

        public void setLifestyle(String lifestyle) {
            this.lifestyle = lifestyle;
        }

        public String getLastUpdatedDate() {
            return lastUpdatedDate;
        }

        public void setLastUpdatedDate(String lastUpdatedDate) {
            this.lastUpdatedDate = lastUpdatedDate;
        }

        public String getTransit() {
            return transit;
        }

        public void setTransit(String transit) {
            this.transit = transit;
        }

        @Override
        public String toString() {
            return "ClassPojo [lifestyle = " + lifestyle + ", lastUpdatedDate = " + lastUpdatedDate + ", transit = " + transit + "]";
        }
    }

}
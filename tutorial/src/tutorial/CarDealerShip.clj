(ns tutorial.CarDealerShip)


(defn isCouponValid
  [code]
  (defstruct Coupon :Desc :Discount)
  (def validCoupon (struct Coupon "20Percent" 0.8))
  (if (= code (:Desc validCoupon))
    true
    false))

(defn getDiscountByCoupon
  [coupon]
  (if (isCouponValid coupon)
    (:Discount validCoupon)
    1))

(defn discountFactor
  [discount]
  (if (> discount 0) discount 1))


(defn calculateDiscount
  [price discount]
  (* price (discountFactor discount)))


(defn applyDiscontToCarPrices
  [discount cars]
  (def result {})
  (doseq [car cars]
    (let [[carType carPrice] car]
      (def priceWithDiscount (calculateDiscount carPrice discount))
      (def result (concat result {carType priceWithDiscount}))))
  result)


;(println (applyDiscontToCarPrices 50000 0.8 {"bmw" 60000, "ferrari" 100000, "fiat" 20000}))

(defn showCarPricesForBudget
  [cars budget]
  (doseq [car cars]
    (def carType (first car))
    (def carPrice (last car))
    (if (>= budget carPrice)
      (println carType "=" carPrice))))


;(showCarPrices 50000 0.8 {"bmw" 60000, "ferrari" 100000, "fiat" 20000})

(defn CarDealerShip
  [budget coupon]
  (def cars {"bmw" 60000, "ferrari" 100000, "fiat" 20000})
  (if (isCouponValid coupon)
    (println "This is a valid coupon")
    (println "This is a invalid coupon"))
  (def discount (getDiscountByCoupon coupon))
  (def cars (applyDiscontToCarPrices discount cars))
  (showCarPricesForBudget cars budget))

(CarDealerShip 50000 "20Percent")

(println "")

(CarDealerShip 50000 "20Percentw")
